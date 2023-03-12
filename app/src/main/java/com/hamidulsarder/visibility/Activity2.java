package com.hamidulsarder.visibility;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.hamidulsarder.visibility.R;

public class Activity2 extends AppCompatActivity {

    LinearLayout activity1,activity2,activity3,activity4;
    CardView bs1,bs2,bs3,bs4,bs5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        activity1 = findViewById(R.id.activity1);
        activity2 = findViewById(R.id.activity2);
        activity3 = findViewById(R.id.activity3);
        activity4 = findViewById(R.id.activity4);

        bs1 = findViewById(R.id.bs1);
        bs2 = findViewById(R.id.bs2);
        bs3 = findViewById(R.id.bs3);
        bs4 = findViewById(R.id.bs4);
        bs5 = findViewById(R.id.bs5);


        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("value");

        if (value == 1){
            activity1.setVisibility(View.VISIBLE);
            activity2.setVisibility(View.GONE);
            activity3.setVisibility(View.GONE);
            activity4.setVisibility(View.GONE);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.activity1));
        } else if (value == 2){
            activity1.setVisibility(View.GONE);
            activity2.setVisibility(View.VISIBLE);
            activity3.setVisibility(View.GONE);
            activity4.setVisibility(View.GONE);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.activity2));
        } else if (value == 3){
            activity1.setVisibility(View.GONE);
            activity2.setVisibility(View.GONE);
            activity3.setVisibility(View.VISIBLE);
            activity4.setVisibility(View.GONE);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.activity3));
        } else if (value == 4){
            activity1.setVisibility(View.GONE);
            activity2.setVisibility(View.GONE);
            activity3.setVisibility(View.GONE);
            activity4.setVisibility(View.VISIBLE);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.activity4));
        }

        bs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                Bundle bs = new Bundle();
                bs.putInt("status",1);
                intent.putExtras(bs);
                startActivity(intent);
            }
        });

        bs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                Bundle bs = new Bundle();
                bs.putInt("status",2);
                intent.putExtras(bs);
                startActivity(intent);
            }
        });

        bs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                Bundle bs = new Bundle();
                bs.putInt("status",3);
                intent.putExtras(bs);
                startActivity(intent);
            }
        });

        bs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                Bundle bs = new Bundle();
                bs.putInt("status",4);
                intent.putExtras(bs);
                startActivity(intent);
            }
        });

        bs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,StatusPage.class);
                Bundle bs = new Bundle();
                bs.putInt("status",5);
                intent.putExtras(bs);
                startActivity(intent);
            }
        });




    } // OnCreate Method close here ============

} // Public class close here====================