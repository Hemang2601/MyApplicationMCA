package com.example.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Extra_Program extends AppCompatActivity {
    Button pro1,pro2,pro3,pro4,pro5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_program);
        pro1 = findViewById(R.id.btnpro1);
        pro2 = findViewById(R.id.btnpro2);
        pro3 = findViewById(R.id.btnpro3);
        pro4 = findViewById(R.id.btnpro4);
        pro5 = findViewById(R.id.btnpro5);

        pro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Extra_Program.this, E_pro1_1.class);
                startActivity(i);
            }
        });
        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Extra_Program.this, E_pro2.class);
                startActivity(i);
            }
        });
        pro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Extra_Program.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });
        pro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Extra_Program.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });
        pro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Extra_Program.this, "NOT MAKE", Toast.LENGTH_SHORT).show();
            }
        });

    }
}