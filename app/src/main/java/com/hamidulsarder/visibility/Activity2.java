package com.hamidulsarder.visibility;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.hamidulsarder.visibility.R;

public class Activity2 extends AppCompatActivity {

    LinearLayout activity1,activity2,activity3,activity4;
    CardView bs1, bs2, bs3, bs4, bs5;
    CardView es1, es2, es3, es4, es5;
    CardView hs1, hs2, hs3, hs4, hs5;
    CardView ts1, ts2, ts3, ts4, ts5;
    public static int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        activity1 = findViewById(R.id.activity1);
        activity2 = findViewById(R.id.activity2);
        activity3 = findViewById(R.id.activity3);
        activity4 = findViewById(R.id.activity4);


        bs1 = findViewById(R.id.bs1);
        bs2 = findViewById(R.id.bs2);
        bs3 = findViewById(R.id.bs3);
        bs4 = findViewById(R.id.bs4);
        bs5 = findViewById(R.id.bs5);

        es1 = findViewById(R.id.es1);
        es2 = findViewById(R.id.es2);
        es3 = findViewById(R.id.es3);
        es4 = findViewById(R.id.es4);
        es5 = findViewById(R.id.es5);

        hs1 = findViewById(R.id.hs1);
        hs2 = findViewById(R.id.hs2);
        hs3 = findViewById(R.id.hs3);
        hs4 = findViewById(R.id.hs4);
        hs5 = findViewById(R.id.hs5);

        ts1 = findViewById(R.id.ts1);
        ts2 = findViewById(R.id.ts2);
        ts3 = findViewById(R.id.ts3);
        ts4 = findViewById(R.id.ts4);
        ts5 = findViewById(R.id.ts5);


        if (value == 1){
            activity1.setVisibility(View.VISIBLE);
            //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.activity1));
        } else if (value == 2){
            activity2.setVisibility(View.VISIBLE);
            //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.activity2));
        } else if (value == 3){
            activity3.setVisibility(View.VISIBLE);
            //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.activity3));
        } else if (value == 4){
            activity4.setVisibility(View.VISIBLE);
            //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.activity4));
        }

        //Bangla Status Start ++++++++++++++++++++++++
        bs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 1";
                StatusPage.status = "দুঃখ আর কষ্ট মানুষকে চিন্তিত করার জন্য আসেনা, এগুলো আসে তার যোগ্যতা আর আত্মবিশ্বাস এর পরীক্ষা নিতে ।";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });

        bs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 2";
                StatusPage.status = "অবশ্যই আমার চরিত্রের দিকে আঙুল তুলুন, কিন্তু শর্ত শুধু একটাই সেই আঙুল যেনো দাগহীন হয় ।";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });

        bs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 3";
                StatusPage.status = "যেদিন মনের দিক থেকে তুমি হেরে যেতে শুরু করবে সেদিন শুধু একটা কথা মনে করবে, তুমি আরম্ভ কেনো করেছিলে?";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });

        bs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 4";
                StatusPage.status = "যখন কোনো আপনজন বিশ্বাসঘাতকতা করে তখন জঙ্গলের হিংস্র বাঘও কুকুরের কাছে হেরে যায় ।";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });

        bs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 5";
                StatusPage.status = "সময়ের কাজ চলে যাওয়া সে যাবেই, তাই জীবনে ভালো কিছু হলে কৃতজ্ঞতা অর্পণ করো, খারাপ কিছু ঘটলে অপেক্ষা করো ।";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });
        //Bangla Status End ==================================


        //English Status Start +++++++++++++++++++++++++++++++
        es1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 1";
                StatusPage.status = "You will fall, You will break, You will fail. And then, You will rise, You will heal, You will overcome. That’s Life.";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });

        es2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 2";
                StatusPage.status = "Your days are better when you focus on your blessings more than your problems.";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });

        es3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 3";
                StatusPage.status = "Life brings Simple Pleasures to us every day. It's up to us to make them wonderful memories.";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });

        es4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 4";
                StatusPage.status = "If you seek Joy within, you will be happy no matter what is going on around you.";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });

        es5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StatusPage.tool = "Status 5";
                StatusPage.status = "Sometimes you just have to erase the messages delete the numbers and move on.";
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                startActivity(intent);
            }
        });
        //English Status End ===================================




    } // OnCreate Method close here ============

} // Public class close here====================