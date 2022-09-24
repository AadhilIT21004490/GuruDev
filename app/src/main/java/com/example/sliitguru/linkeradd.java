package com.example.sliitguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class linkeradd extends AppCompatActivity {

    EditText title,link,desc;
    Button add,clear;
    linkerDbHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkeradd);


        title=findViewById(R.id.title);
        link=findViewById(R.id.link);
        desc=findViewById(R.id.desc);
        add=findViewById(R.id.add);
        clear=findViewById(R.id.clear);

        DB=new linkerDbHelper(this);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titletxt=title.getText().toString();
                String linktxt=link.getText().toString();
                String desctxt=desc.getText().toString();

                Boolean checkinsertdata =DB.insertlinkerdata(titletxt,linktxt,desctxt);
                if (checkinsertdata==true){
                    Toast.makeText(linkeradd.this,"New Linker Inserted!",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(linkeradd.this,"New Linker Insertion fail!",Toast.LENGTH_LONG).show();
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("");
                link.setText("");
                desc.setText("");
            }
        });
    }
}