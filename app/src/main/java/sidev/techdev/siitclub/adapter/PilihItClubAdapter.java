package sidev.techdev.siitclub.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import sidev.techdev.siitclub.R;
import sidev.techdev.siitclub.activity.ListMateriActivity;

public class PilihItClubAdapter extends BaseAdapter {
    Context context;
    int[] name;
    int[][] judul;
    int[] logo;
    String[] content;

    public PilihItClubAdapter(Context context, int[] name, int[][] judul, int[] logo, String[] content){
        this.context = context;
        this.name = name;
        this.judul = judul;
        this.logo = logo;
    }


    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_grid_pilihitclub, null);
        TextView tx = view.findViewById(R.id.name_itclub);
        ImageView img = view.findViewById(R.id.logo_itclub);

        tx.setText(name[position]);
        img.setImageResource(logo[position]);

        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(context, ListMateriActivity.class);
                btn.putExtra("club", name[position]);
                btn.putExtra("judul", judul[position]);
                context.startActivity(btn);
            }
        });

        return view;
    }
}
