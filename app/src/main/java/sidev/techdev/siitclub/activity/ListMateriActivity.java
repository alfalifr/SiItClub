package sidev.techdev.siitclub.activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import sidev.techdev.siitclub.R;
import sidev.techdev.siitclub.adapter.ListMateriAdapter;

public class ListMateriActivity extends AppCompatActivity {
    ListView listview;
    String namaClub;
    int[] judulMateri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_materi);

        /*FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.model_list_materi, new PilihItClubFragment());
        ft.commit();*/

        listview = findViewById(R.id.list_materi);
        Intent btn =  getIntent();
        namaClub = getResources().getString(btn.getIntExtra("club", 0));
        judulMateri = btn.getIntArrayExtra("judul");

        //ListMateriAdapter adp = new ListMateriAdapter(this, judulMateri, );



    }
}
