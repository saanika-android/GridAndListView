package com.example.gridandlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivty extends AppCompatActivity {

    ListView list;
    ArrayList<Items> fruitList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_activty);
        list =findViewById(R.id.listview_act);
        fruitList.add(new Items("Apple", R.drawable.apple, "10/kg"));
        fruitList.add(new Items("Litchii", R.drawable.lichi, "12/kg"));
        fruitList.add(new Items("Custard Apple", R.drawable.custardapple, "17/kg"));
        fruitList.add(new Items("Orange", R.drawable.orange, "10/kg"));
        fruitList.add(new Items("Mango", R.drawable.mango, "30/kg"));

        ListViewAdapter listviewAdapter = new ListViewAdapter(this, R.layout.listview_items, fruitList);
        list.setAdapter(listviewAdapter);
    }
}