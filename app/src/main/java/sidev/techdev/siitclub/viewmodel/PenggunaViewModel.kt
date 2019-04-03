package sidev.techdev.siitclub.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Patterns
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import sidev.techdev.siitclub.model.Pengguna
import java.util.regex.Pattern

class PenggunaViewModel: ViewModel(){
    private val data= MutableLiveData<Pengguna>()

    val refKolesi= FirebaseFirestore.getInstance().collection("Pengguna")

    fun isiData(email: String): MutableLiveData<Pengguna>?{
        if(Pattern.matches(Patterns.EMAIL_ADDRESS.pattern(), email)){
            refKolesi.document(email).get().addOnSuccessListener { dataSnapshot ->
                val pengguna=
                        try {
                            val nama = dataSnapshot.getString("nama")!!
                            val nrp = dataSnapshot.getString("nrp")!!
                            val password = dataSnapshot.getString("password")!!
                            val status = dataSnapshot.getString("status")!!
                            val user_id = dataSnapshot.getString("user_id")
                            val no_telp = dataSnapshot.getString("no_telp")!!

                            Pengguna(email, nama, nrp, password, status, user_id, no_telp)
                        } catch (error: Exception){
                            null
                        }
                data.value= pengguna
            }
            return if(data.value != null) data
            else null
        }
        return null
    }

    fun simpanData(dokumen: Pengguna): Task<Void> {
        return refKolesi.document(dokumen.email).set(dokumen)
    }
}