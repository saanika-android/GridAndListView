package com.example.gridandlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ReccyclerView extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reccycler_view);

        MyListData[] myListData = new MyListData[] {
                new MyListData("News","Indonesia-Masters-Saina Nehwal sails into semifinals, PV Sindhu lose quarters",R.drawable.images),
                new MyListData("News","Virat Kohli has revealed that India’s 2014 tour of England, which was the leanest patch of his career, remains a milestone in his Test career.",R.drawable.cricket),
                new MyListData("News","Matthias Ginter ‘definitely’ not coming to Chelsea",R.drawable.fb),

        };
        recyclerView= findViewById(R.id.recyclerView_act);
        MyListAdapter adapter=new MyListAdapter(myListData);

        recyclerView.setHasFixedSize(true);


        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}