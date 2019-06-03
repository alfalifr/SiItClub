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
    int[][] isiMateri = {
            {R.string.materi_isi_isad_1, R.string.materi_isi_isad_2, R.string.materi_isi_isad_3, R.string.materi_isi_isad_4, R.string.materi_isi_isad_5},
            {R.string.materi_isi_isgc_1, R.string.materi_isi_isgc_2, R.string.materi_isi_isgc_3, R.string.materi_isi_isgc_4},
            {R.string.materi_isi_isgd_1, R.string.materi_isi_isgd_2, R.string.materi_isi_isgd_3},
            {R.string.materi_isi_iswd_1, R.string.materi_isi_iswd_2}
    };


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

        ListMateriAdapter adp = new ListMateriAdapter(this, judulMateri, isiMateri);
        listview.setAdapter(adp);

    }
}
