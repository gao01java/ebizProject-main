package com.example.project1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MadeAccountActivity2 extends AppCompatActivity {

    ImageButton accountPageend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madeaccount2);


        findViewById(R.id.account).setOnClickListener(v -> {
            shodDialog();
        });


    }

    protected void shodDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("경고");
        builder.setMessage("회원 가입 하시게 습니까?");
        builder.setIcon(R.drawable.tools);
        builder.setPositiveButton("가입", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(MadeAccountActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                new AlertDialog.Builder(MadeAccountActivity2.this)
                        .setMessage("취소되었습니다").create()
                        .show();

            }
        });
        builder.create().show();
    }
}