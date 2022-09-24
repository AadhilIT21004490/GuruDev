package com.example.sliitguru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class linker extends AppCompatActivity {

    FloatingActionButton fap;
    RecyclerView recyclerView;
    ArrayList<String> title,link,desc;
    linkerDbHelper DB;
    linkerAdapter adapter;
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

        DB = new linkerDbHelper(this);
        title=new ArrayList<>();
        link=new ArrayList<>();
        desc=new ArrayList<>();
        recyclerView=findViewById(R.id.recycleview);
        adapter=new linkerAdapter(this,title,link,desc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displaydata();
    }

    private void displaydata() {
        Cursor cursor=DB.getdata();
        if (cursor.getCount()==0){
            Toast.makeText(linker.this,"No Entry Exists",Toast.LENGTH_LONG).show();
            return;
        }
        else{
            while (cursor.moveToNext()){
                title.add(cursor.getString(0));
                link.add(cursor.getString(1));
                desc.add(cursor.getString(2));
            }
        }
    }
}