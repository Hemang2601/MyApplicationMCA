package com.example.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UNIT1_LIST_PAGE extends AppCompatActivity {

    Button pro1,pro2,pro3,pro4,pro5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1_list_page);

        pro1 = findViewById(R.id.btnpro1);
        pro2 = findViewById(R.id.btnpro2);
        pro3 = findViewById(R.id.btnpro3);
        pro4 = findViewById(R.id.btnpro4);
        pro5 = findViewById(R.id.btnpro5);


        pro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT1_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });
        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT1_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });
        pro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT1_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });
        pro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT1_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });
        pro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT1_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

    }
}