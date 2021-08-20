package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class accountActivity extends AppCompatActivity {



    ImageButton backIb;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        backIb=(ImageButton)findViewById(R.id.back1);
        backIb.setOnClickListener(v -> {
            Intent intent=new Intent(accountActivity.this,MainActivity.class);
            startActivity(intent);
        });



    }
}
