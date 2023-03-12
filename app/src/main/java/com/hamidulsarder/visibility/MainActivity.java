package com.hamidulsarder.visibility;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hamidulsarder.visibility.R;

public class MainActivity extends AppCompatActivity {

    CardView bBS, bES, bHS, bTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.toolbar));

        bBS = findViewById(R.id.bBS);
        bES = findViewById(R.id.bES);
        bHS = findViewById(R.id.bHS);
        bTS = findViewById(R.id.bTS);

        bBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Activity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("value",1);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        bES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Activity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("value",2);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        bHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Activity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("value",3);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        bTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Activity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("value",4);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });






    } // OnCreate Method Close Here ============


} // Public Class Close here ===================