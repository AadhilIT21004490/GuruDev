package com.example.sliitguru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToDo extends AppCompatActivity {
    RecyclerView recyclerView;
    FloatingActionButton add_button;

    todo_DB_Helper myDB;
    ArrayList<String> todo_id, todo_title, todo_desc;
    ToDoAdapter toDoAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        recyclerView = findViewById(R.id.recycleview);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ToDo.this, AddToDoActivity.class);
                startActivity(intent);
            }
        });

        myDB = new todo_DB_Helper(ToDo.this);
        todo_id = new ArrayList<>();
        todo_title = new ArrayList<>();
        todo_desc = new ArrayList<>();

        storeDataInArrays();

        toDoAdapter = new ToDoAdapter(ToDo.this, todo_id, todo_title, todo_desc);
        recyclerView.setAdapter(toDoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(ToDo.this));
    }

    void storeDataInArrays() {
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }else {
            while (cursor.moveToNext()){
                todo_id.add(cursor.getString(0));
                todo_title.add(cursor.getString(1));
                todo_desc.add(cursor.getString(2));
            }
        }
    }
}