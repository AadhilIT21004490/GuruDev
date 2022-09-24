package com.example.sliitguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddToDoActivity extends AppCompatActivity {

    EditText todo_add_title, todo_add_desc;
    Button save_button;
    Button del_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);

        todo_add_title = findViewById(R.id.todo_add_title);
        todo_add_desc = findViewById(R.id.todo_add_desc);
        save_button = findViewById(R.id.save_button);
        del_button = findViewById(R.id.del_button);
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todo_DB_Helper myDB = new todo_DB_Helper(AddToDoActivity.this);
                myDB.addToDo(todo_add_title.getText().toString().trim(), todo_add_desc.getText().toString().trim());

            }
        });


    }
}