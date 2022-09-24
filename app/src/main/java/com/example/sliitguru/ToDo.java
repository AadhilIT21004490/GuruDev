package com.example.sliitguru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ToDo extends AppCompatActivity {
    RecyclerView recyclerView;
    FloatingActionButton add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        recyclerView = findViewById(R.id.recycleview);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (  ToDo.this, AddToDoActivity.class);
                startActivity(intent);
            }
        });
    }
}