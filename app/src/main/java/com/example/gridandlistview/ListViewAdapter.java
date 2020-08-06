package com.example.gridandlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<Items> {
    ArrayList<Items> fruitList = new ArrayList<>();

    public ListViewAdapter(Context context, int textViewResourceId, ArrayList<Items> objects) {
        super(context, textViewResourceId, objects);
        fruitList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.listview_items, null);
        TextView textView= (TextView) v.findViewById(R.id.textView3);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView1);
        TextView textView2 = (TextView) v.findViewById(R.id.textView1);
        textView.setText(fruitList.get(position).getFruitName());
        imageView.setImageResource(fruitList.get(position).getFruitImage());
        textView2.setText(fruitList.get(position).getFruitPrice());
        return v;

    }

}

