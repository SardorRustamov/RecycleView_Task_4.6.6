package com.example.recycleviewexample_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        view();
    }
    void view(){
        TextView tv_profile=findViewById(R.id.tv_profile);
        Member member=(Member) getIntent().getSerializableExtra("member");
        tv_profile.setText(member.toString());
    }
}