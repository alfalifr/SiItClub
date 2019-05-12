package sidev.techdev.siitclub.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import sidev.techdev.siitclub.R;
import sidev.techdev.siitclub.activity.IsiMateriActivity;

public class ListMateriAdapter extends BaseAdapter {
    Context context;
    int[] judulMateri;
    int[][] isiMateri;

    public ListMateriAdapter(Context context, int[]judulMateri , int[][] isiMateri){
        this.context = context;
        this.judulMateri = judulMateri;
        this.isiMateri = isiMateri;

    }
    @Override
    public int getCount() {
        return judulMateri.length;
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
        View view = LayoutInflater.from(context).inflate(R.layout.model_list_materi, null);

        TextView tx = view.findViewById(R.id.name_materi);
        TextView tx2 = view.findViewById(R.id.number_materi);

        tx.setText(context.getResources().getString(judulMateri[position]));
        tx2.setText(position + 1);

        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn = new Intent(context, IsiMateriActivity.class);
                btn.putExtra("isi materi", isiMateri[position]);
            }
        });

        return view;
    }
}
