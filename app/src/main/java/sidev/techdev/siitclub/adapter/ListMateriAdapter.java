package sidev.techdev.siitclub.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import sidev.techdev.siitclub.R;

public class ListMateriAdapter extends BaseAdapter {
    Context context;
    String[] materi;

    public ListMateriAdapter(Context context, String[] materi){
        this.context = context;
        this.materi = materi;

    }
    @Override
    public int getCount() {
        return materi.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_list_materi, null);

        TextView tx = view.findViewById(R.id.name_materi);
        TextView tx2 = view.findViewById(R.id.number_materi);

        tx.setText(materi[position]);
        tx2.setText(position + 1);
        return null;
    }
}
