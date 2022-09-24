package com.example.sliitguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class linker extends AppCompatActivity {

    FloatingActionButton fap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linker);
        fap=findViewById(R.id.floatingActionButton);

        fap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(linker.this,linkeradd.class);
                startActivity(i);
            }
        });
    }
}