package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton menuB,change_account,School_web;

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



    }
}