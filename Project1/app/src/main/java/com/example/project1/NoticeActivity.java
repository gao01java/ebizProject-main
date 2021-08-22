package com.example.project1;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class NoticeActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        findViewById(R.id.back1).setOnClickListener(v -> {
            Intent intent = new Intent(NoticeActivity.this, MainActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.notice3).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("http://www.gunpo-ebiz.hs.kr/board.list?mcode=1610");
            intent.setData(uri);
            startActivity(intent);
        });

        findViewById(R.id.notice2).setOnClickListener(v -> {
            shodDialog();
        });

        findViewById(R.id.lof).setOnClickListener(v -> {
            shodDialog();
        });
        findViewById(R.id.survey).setOnClickListener(v -> {
            shodDialog();
        });


    }

    protected void shodDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("경고");
        builder.setMessage("작업중 입니다.접근 할수없습니다.");
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
