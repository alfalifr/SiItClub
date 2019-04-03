package sidev.techdev.siitclub.model

import com.google.firebase.firestore.Exclude

data class Pengguna(@Exclude val email: String, val nama: String, val nrp: String, val password: String,
                    val status: String, val user_id: String?, val no_telp: String)