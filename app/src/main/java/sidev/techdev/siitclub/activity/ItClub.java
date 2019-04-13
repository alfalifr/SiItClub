package sidev.techdev.siitclub.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import sidev.techdev.siitclub.activity.PilihItClub;
import sidev.techdev.siitclub.R;

public class ItClub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_club);
        LinearLayout isad = (LinearLayout) findViewById(R.id.isad);
        isad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        PilihItClub frag = new PilihItClub();
//        ft.replace(R.id.frame, frag);
        ft.commit();
    }
}
