package com.example.project1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton menuB,change_account,School_web,order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.draw);

        menuB = (ImageButton) findViewById(R.id.menuButton);
        menuB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

/** error order button*/
        order=(ImageButton)findViewById(R.id.SmartOrder);
        order.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,smartBTACtivity.class);
            startActivity(intent);
        });

        findViewById(R.id.foodIbn).setOnClickListener(v -> {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("http://www.gunpo-ebiz.hs.kr/lunch.lunch_list?mcode=161311&cate=161311");
            intent.setData(uri);
            startActivity(intent);
        });

        findViewById(R.id.bechelorIbn).setOnClickListener(v -> {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("http://www.gunpo-ebiz.hs.kr/calendar.calendar_list?view=main");
            intent.setData(uri);
            startActivity(intent);
        });




        change_account=(ImageButton)findViewById(R.id.loginChange_Activity);
        change_account.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,accountActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.SchoolWeb).setOnClickListener(v -> {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("http://www.gunpo-ebiz.hs.kr");
            intent.setData(uri);
            startActivity(intent);
        });


        findViewById(R.id.noticeIbn).setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,NoticeActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.image1).setOnClickListener(v -> {
           shodDialog();
        });
        findViewById(R.id.image2).setOnClickListener(v -> {
            shodDialog();
        });

        findViewById(R.id.plusButton).setOnClickListener(v -> {
            shodDialog();
        });



    }


    protected void shodDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("경고");
        builder.setMessage("작업중 입니다.");
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