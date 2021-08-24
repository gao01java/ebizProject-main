package com.example.project1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class loginActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        findViewById(R.id.login_button).setOnClickListener(v -> {
            Intent intent=new Intent(loginActivity.this,MainActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.continueAccount).setOnClickListener(v -> {
            Intent intent=new Intent(loginActivity.this,MadeAccountActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.back2).setOnClickListener(v -> {
            Intent intent=new Intent(loginActivity.this,MainActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.googleLogin).setOnClickListener(v ->{
            shodDialog();
        });
        findViewById(R.id.facebookLogin).setOnClickListener(v ->{
            shodDialog();
        });
        findViewById(R.id.kakaologin).setOnClickListener(v ->{
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
