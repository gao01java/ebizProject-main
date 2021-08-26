package com.example.project1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class smartBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartb);

        findViewById(R.id.back2).setOnClickListener(v -> {
            Intent intent=new Intent(smartBActivity.this,MainActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.order).setOnClickListener(v -> {
            shodDialog();
        });

        findViewById(R.id.git).setOnClickListener(v -> {
            shodDialog();
        });

        findViewById(R.id.pay).setOnClickListener(v -> {
            shodDialog();
        });

        findViewById(R.id.coupon).setOnClickListener(v -> {
            shodDialog();
        });

        findViewById(R.id.star).setOnClickListener(v -> {
            shodDialog();
        });

        findViewById(R.id.bag).setOnClickListener(v -> {
            shodDialog();
        });

    }



    protected void shodDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("경고");
        builder.setMessage("준비중 입니다.");
        builder.setIcon(R.drawable.tools);
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
    }
}
