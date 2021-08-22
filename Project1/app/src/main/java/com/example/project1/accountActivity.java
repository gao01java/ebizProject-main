package com.example.project1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class accountActivity extends AppCompatActivity {



    ImageButton backIb,acc_profile;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        backIb=(ImageButton)findViewById(R.id.back1);
        backIb.setOnClickListener(v -> {
            Intent intent=new Intent(accountActivity.this,MainActivity.class);
            startActivity(intent);
        });


        findViewById(R.id.account_profile).setOnClickListener(v -> {
            shodDialog();
        });
        findViewById(R.id.profilethro).setOnClickListener(v -> {
            shodDialog();
        });
        findViewById(R.id.thro).setOnClickListener(v -> {
            shodDialog();
        });
        findViewById(R.id.com1).setOnClickListener(v -> {
            shodDialog();
        });

    }
    protected void shodDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("경고");
        builder.setMessage("지금 작업중 입니다.접근 할수없습니다. 불편을 드려 죄송합니다.");
        builder.setIcon(R.drawable.tools);
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        /*

        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
*/
        builder.create().show();
    }
}
