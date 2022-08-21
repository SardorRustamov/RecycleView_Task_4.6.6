package com.example.recycleviewexample_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));
        items.add(new Item("TITLE", "Description", R.drawable.ic_baseline_image_not_supported_24));

        recyclerAdapter = new RecyclerAdapter(this, items);
        recyclerView.setAdapter(recyclerAdapter);

    }

    public void openItemDetails(Item item){
        openActivity();
    }
    void openActivity(){
        Member member = new Member("Sardor", "R");
        Intent intent=new Intent(this, ProfileActivity.class);
        intent.putExtra("member", member);
        startActivity(intent);
    }
}