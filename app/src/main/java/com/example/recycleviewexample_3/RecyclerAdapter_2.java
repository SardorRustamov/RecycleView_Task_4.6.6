package com.example.recycleviewexample_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter_2 extends RecyclerView.Adapter<RecyclerAdapter_2.ViewHolder_2> {

    ArrayList<Item_2> items_2;

    public RecyclerAdapter_2(ArrayList<Item_2> items_2) {
        this.items_2 = items_2;
    }
    @NonNull
    @Override
    public RecyclerAdapter_2.ViewHolder_2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_member_2, parent, false);
        return new ViewHolder_2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter_2.ViewHolder_2 holder, int position) {
        Item_2 item_2 = items_2.get(position);

        holder.text.setText(item_2.text2);
        holder.imageView2.setImageResource((item_2.image2));
    }

    @Override
    public int getItemCount() {
        return items_2.size();
    }
    public class ViewHolder_2 extends RecyclerView.ViewHolder{

        TextView text;
        ImageView imageView2;
        public ViewHolder_2(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.text2);
            imageView2=itemView.findViewById(R.id.image2);
        }
    }
}