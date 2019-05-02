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
import sidev.techdev.siitclub.activity.MateriActivity;

public class PilihItClubAdapter extends BaseAdapter {
    Context context;
    String[] name;
    int[] logo;
    String[] content;

    public PilihItClubAdapter(Context context, String[] name, int[] logo, String[] content){
        this.context = context;
        this.name = name;
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
        View view;

        if(logo != null) {
            view = LayoutInflater.from(context).inflate(R.layout.grid_pilihitclub, null);
            TextView tx = view.findViewById(R.id.name_itclub);
            ImageView img = view.findViewById(R.id.logo_itclub);

            tx.setText(name[position]);
            img.setImageResource(logo[position]);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.list_materi, null);
            TextView tx = view.findViewById(R.id.name_materi);
            TextView tx2 = view.findViewById(R.id.number_materi);

            tx.setText(name[position]);
            tx2.setText(position + 1);
        }

        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(logo != null) {
                    Intent btn = new Intent(context, ListMateriActivity.class);
                    btn.putExtra("judul", "Materi " + name[position]);
                    context.startActivity(btn);
                }else {
                    Intent btn = new Intent(context, MateriActivity.class);
                    btn.putExtra("judul materi", name[position]);
                    btn.putExtra("content", content[position]);
                    context.startActivity(btn);
                }
            }
        });

        return view;
    }
}
