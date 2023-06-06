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
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hamidulsarder.visibility.R;

public class MainActivity extends AppCompatActivity {

    CardView bBS, bES, bHS, bTS;

    TextView git;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        bBS = findViewById(R.id.bBS);
        bES = findViewById(R.id.bES);
        bHS = findViewById(R.id.bHS);
        bTS = findViewById(R.id.bTS);

        bBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Activity2.value=1;
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);

            }
        });

        bES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Activity2.value=2;
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);

            }
        });

        bHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Activity2.value=3;
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);

            }
        });

        bTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Activity2.value=4;
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);

            }
        });






    } // OnCreate Method Close Here ============


} // Public Class Close here ===================