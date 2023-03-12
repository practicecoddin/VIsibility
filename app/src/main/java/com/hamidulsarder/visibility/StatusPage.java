package com.hamidulsarder.visibility;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class StatusPage extends AppCompatActivity {

    RelativeLayout banglaStatus1,banglaStatus2,banglaStatus3,banglaStatus4,banglaStatus5;
    RelativeLayout englishStatus1,englishStatus2,englishStatus3,englishStatus4,englishStatus5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        getWindow().getDecorView().setSystemUiVisibility(android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.toolbar));

        banglaStatus1 = findViewById(R.id.banglaStatus1);
        banglaStatus2 = findViewById(R.id.banglaStatus2);
        banglaStatus3 = findViewById(R.id.banglaStatus3);
        banglaStatus4 = findViewById(R.id.banglaStatus4);
        banglaStatus5 = findViewById(R.id.banglaStatus5);

        englishStatus1 = findViewById(R.id.englishStatus1);
        englishStatus2 = findViewById(R.id.englishStatus2);
        englishStatus3 = findViewById(R.id.englishStatus3);
        englishStatus4 = findViewById(R.id.englishStatus4);
        englishStatus5 = findViewById(R.id.englishStatus5);

        Bundle bs = getIntent().getExtras();
        int banglaStutas = bs.getInt("status",1);

        if (banglaStutas == 1){
            banglaStatus1.setVisibility(View.VISIBLE);
        }
        else if (banglaStutas == 2){
            banglaStatus2.setVisibility(View.VISIBLE);
        }
        else if (banglaStutas == 3){
            banglaStatus3.setVisibility(View.VISIBLE);
        }
        else if (banglaStutas == 4){
            banglaStatus4.setVisibility(View.VISIBLE);
        }
        else if (banglaStutas == 5){
            banglaStatus5.setVisibility(View.VISIBLE);
        }




























    }
}