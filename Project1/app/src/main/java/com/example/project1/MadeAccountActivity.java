package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MadeAccountActivity extends AppCompatActivity {


    CheckBox box1,box2,box3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madeaccount);

        box1=(CheckBox)findViewById(R.id.checkbox1);
        box2=(CheckBox)findViewById(R.id.checkbox2);
        box3=(CheckBox)findViewById(R.id.checkbox3);



        findViewById(R.id.nextImageButton1).setOnClickListener(v -> {
            Intent intent = new Intent(MadeAccountActivity.this,MadeAccountActivity2.class);
            startActivity(intent);
        });

        findViewById(R.id.back2).setOnClickListener(v -> {
            Intent intent=new Intent(MadeAccountActivity.this,loginActivity.class);
            startActivity(intent);
        });

    }
}
