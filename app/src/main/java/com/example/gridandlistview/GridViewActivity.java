package com.example.gridandlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {
    GridView simpleList;

    private ArrayList<Items> fruitList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = findViewById(R.id.gridview_act);
        fruitList.add(new Items("Apple", R.drawable.apple, "10/kg"));
        fruitList.add(new Items("Mango", R.drawable.mango, "30/kg"));
        fruitList.add(new Items("Custard Apple", R.drawable.custardapple, "17/kg"));
        fruitList.add(new Items("Litchi", R.drawable.lichi, "12/kg"));
        fruitList.add(new Items("Orange", R.drawable.orange, "10/kg"));
        View selectedImageView = findViewById(R.id.selectedImageView);

        GridViewAdapter gridviewAdapter = new GridViewAdapter(this, R.layout.gridview_item, fruitList);
        simpleList.setAdapter(gridviewAdapter);




        }
    }

