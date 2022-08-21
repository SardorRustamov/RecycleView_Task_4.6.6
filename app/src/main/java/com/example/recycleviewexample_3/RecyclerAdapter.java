package com.example.recycleviewexample_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    public MainActivity activity;
    ArrayList<Item> items;

    public RecyclerAdapter(MainActivity activity, ArrayList<Item> items) {
        this.items = items;
        this.activity=activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_member, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);

        holder.title.setText(item.title);
        holder.description.setText(item.description);
        holder.imageView.setImageResource(item.image);


        LinearLayout lay_click= ((ViewHolder) holder).lay_click;

        lay_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.openItemDetails(item);
                Toast.makeText(activity, "Open Activity № "+position, Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class  ViewHolder extends RecyclerView.ViewHolder{

        TextView title, description;
        ImageView imageView;
        public LinearLayout lay_click;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            lay_click=itemView.findViewById(R.id.ln_click);

            title=itemView.findViewById(R.id.tv_item_title);
            description=itemView.findViewById(R.id.tv_item_description);
            imageView=itemView.findViewById(R.id.img_item);
        }
    }
}
