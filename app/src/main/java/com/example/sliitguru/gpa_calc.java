package com.example.sliitguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class gpa_calc extends AppCompatActivity {
    LinearLayout s1,s2,s3,s4,s5,s6,s7,s8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gpa_calc);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
        s5=findViewById(R.id.s5);
        s6=findViewById(R.id.s6);
        s7=findViewById(R.id.s7);
        s8=findViewById(R.id.s8);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s1= new Intent(gpa_calc.this,gpa_calculation_s1.class);
                startActivity(s1);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s2= new Intent(gpa_calc.this,gpa_calculation_s2.class);
                startActivity(s2);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s3= new Intent(gpa_calc.this,gpa_calculation_s3.class);
                startActivity(s3);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s4= new Intent(gpa_calc.this,gpa_calculation_s4.class);
                startActivity(s4);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s5= new Intent(gpa_calc.this,gpa_calculation_s5.class);
                startActivity(s5);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s6= new Intent(gpa_calc.this,gpa_calculation_s6.class);
                startActivity(s6);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s7= new Intent(gpa_calc.this,gpa_calculation_s7.class);
                startActivity(s7);
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s8= new Intent(gpa_calc.this,gpa_calculation_s8.class);
                startActivity(s8);
            }
        });
    }
}