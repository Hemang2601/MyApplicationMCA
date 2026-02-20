package com.example.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class UNIT3_LIST_PAGE extends AppCompatActivity {

    // Declaring all 15 buttons
    MaterialButton pro29, pro30, pro31, pro32, pro33, pro34, pro35, pro36, pro37, pro38, pro39, pro40, pro41, pro42, pro43;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3_list_page);

        pro29 = findViewById(R.id.btnpro29);
        pro30 = findViewById(R.id.btnpro30);
        pro31 = findViewById(R.id.btnpro31);
        pro32 = findViewById(R.id.btnpro32);
        pro33 = findViewById(R.id.btnpro33);
        pro34 = findViewById(R.id.btnpro34);
        pro35 = findViewById(R.id.btnpro35);
        pro36 = findViewById(R.id.btnpro36);
        pro37 = findViewById(R.id.btnpro37);
        pro38 = findViewById(R.id.btnpro38);
        pro39 = findViewById(R.id.btnpro39);
        pro40 = findViewById(R.id.btnpro40);
        pro41 = findViewById(R.id.btnpro41);
        pro42 = findViewById(R.id.btnpro42);
        pro43 = findViewById(R.id.btnpro43);

        // 2. Setting Click Listeners for each button individually

        pro29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro29.class);
                startActivity(i);
            }
        });

        pro30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro30.class);
                startActivity(i);
            }
        });

        pro31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro31.class);
                startActivity(i);

            }
        });

        pro32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro32.class);
                startActivity(i);
            }
        });

        pro33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro33.class);
                startActivity(i);
            }
        });

        pro34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro34.class);
                startActivity(i);
            }
        });

        pro35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro35.class);
                startActivity(i);
            }
        });

        pro36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro36.class);
                startActivity(i);

            }
        });

        pro37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT3_LIST_PAGE.this, UNIT3_pro37.class);
                startActivity(i);
            }
        });

        pro38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT3_LIST_PAGE.this, "Program 38: NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT3_LIST_PAGE.this, "Program 39: NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT3_LIST_PAGE.this, "Program 40: NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT3_LIST_PAGE.this, "Program 41: NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT3_LIST_PAGE.this, "Program 42: NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT3_LIST_PAGE.this, "Program 43: NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}