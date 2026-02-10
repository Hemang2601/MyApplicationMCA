package com.example.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class UNIT2_LIST_PAGE extends AppCompatActivity {

    // Declare all buttons manually
    Button pro6, pro7, pro8, pro9, pro10, pro11, pro12, pro13, pro14, pro15,
            pro16, pro17, pro18, pro19, pro20, pro21, pro22, pro23, pro24,
            pro25, pro26, pro27, pro28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2_list_page);

        // --- 1. FIND ALL IDs MANUALLY ---
        pro6 = findViewById(R.id.btn_pro6);
        pro7 = findViewById(R.id.btn_pro7);
        pro8 = findViewById(R.id.btn_pro8);
        pro9 = findViewById(R.id.btn_pro9);
        pro10 = findViewById(R.id.btn_pro10);
        pro11 = findViewById(R.id.btn_pro11);
        pro12 = findViewById(R.id.btn_pro12);
        pro13 = findViewById(R.id.btn_pro13);
        pro14 = findViewById(R.id.btn_pro14);
        pro15 = findViewById(R.id.btn_pro15);
        pro16 = findViewById(R.id.btn_pro16);
        pro17 = findViewById(R.id.btn_pro17);
        pro18 = findViewById(R.id.btn_pro18);
        pro19 = findViewById(R.id.btn_pro19);
        pro20 = findViewById(R.id.btn_pro20);
        pro21 = findViewById(R.id.btn_pro21);
        pro22 = findViewById(R.id.btn_pro22);
        pro23 = findViewById(R.id.btn_pro23);
        pro24 = findViewById(R.id.btn_pro24);
        pro25 = findViewById(R.id.btn_pro25);
        pro26 = findViewById(R.id.btn_pro26);
        pro27 = findViewById(R.id.btn_pro27);
        pro28 = findViewById(R.id.btn_pro28);



        pro6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT2_LIST_PAGE.this, UNIT2_pro6.class);
                startActivity(i);
            }
        });

        pro7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT2_LIST_PAGE.this, UNIT2_pro7.class);
                startActivity(i);
            }
        });

        pro8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT2_LIST_PAGE.this, UNIT2_pro8.class);
                startActivity(i);
            }
        });

        pro9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT2_LIST_PAGE.this, UNIT2_pro9.class);
                startActivity(i);
            }
        });

        // SPECIAL: PRO 10 launches the Calculator
        pro10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UNIT2_LIST_PAGE.this, UNIT2_pro10.class);
                startActivity(i);
            }
        });

        pro11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

        pro28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UNIT2_LIST_PAGE.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}