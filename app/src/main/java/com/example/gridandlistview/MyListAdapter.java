package com.example.gridandlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private MyListData[] listData;

    public MyListAdapter(MyListData[] listData){
        this.listData=listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recyclerlayout,parent,false);
       ViewHolder viewHolder=new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {
        final MyListData myListData=listData[position];
        holder.textView.setText(listData[position].getNews());
        holder.imageView.setImageResource(listData[position].getImage());
        holder.textView1.setText(listData[position].getDescription());
        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item:"+myListData.getDescription(),Toast.LENGTH_LONG).show();
            }
        });
    }
    public int getItemCount(){
        return listData.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public TextView textView1;
        public CardView cardView;
        public ViewHolder(View itemView){
            super(itemView);
            this.imageView=itemView.findViewById(R.id.game);
            this.textView=itemView.findViewById(R.id.name);
            this.textView1=itemView.findViewById(R.id.description);
            cardView=itemView.findViewById(R.id.card_view);

        }
    }
}
