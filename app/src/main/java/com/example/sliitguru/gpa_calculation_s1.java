package com.example.sliitguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class gpa_calculation_s1 extends AppCompatActivity  {
    Spinner m1,m2,m3,m4,m5,m6,m7;
    EditText c1,c2,c3,c4,c5,c6,c7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_calculation_s1);
        m1=findViewById(R.id.m1);
        m2=findViewById(R.id.m2);
        m3=findViewById(R.id.m3);
        m4=findViewById(R.id.m4);
        m5=findViewById(R.id.m5);
        m6=findViewById(R.id.m6);
        m7=findViewById(R.id.m7);

        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);

        String[] marks={"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","D-","E"};
        Double[] markarr={4.0,4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.3,1.0,0.7,0.0};
        Double intmark1,intmark2,intmark3,intmark4,intmark5,intmark6,intmark7;
        Double total1,total2,total3,total4,total5,total6,total7;

        ArrayAdapter<String> adapter_m1= new ArrayAdapter<String>(gpa_calculation_s1.this, android.R.layout.simple_spinner_dropdown_item,marks);
        adapter_m1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m1.setAdapter(adapter_m1);

        String selected_m1=m1.getSelectedItem().toString().trim();

        switch (selected_m1){

            case "A+":
                 intmark1=markarr[0];
                 total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                 Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "A":
                 intmark1=markarr[1];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "A-":
                 intmark1=markarr[2];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "B+":
                 intmark1=markarr[3];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "B":
                 intmark1=markarr[4];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "B-":
                 intmark1=markarr[5];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "C+":
                 intmark1=markarr[6];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "C":
                 intmark1=markarr[7];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "C-":
                 intmark1=markarr[8];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "D+":
                 intmark1=markarr[9];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "D":
                 intmark1=markarr[10];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "D-":
                 intmark1=markarr[11];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();
            case "E":
                 intmark1=markarr[12];
                total1=intmark1*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total1,Toast.LENGTH_SHORT).show();


        }

        ArrayAdapter<String> adapter_m2= new ArrayAdapter<>(gpa_calculation_s1.this, android.R.layout.simple_spinner_item,marks);
        adapter_m1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m2.setAdapter(adapter_m2);
        m2.setSelection(0);

        String selected_m2=m2.getSelectedItem().toString().trim();

        switch (selected_m2){

            case "A+":
                intmark2=markarr[0];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "A":
                intmark2=markarr[1];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "A-":
                intmark2=markarr[2];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "B+":
                intmark2=markarr[3];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "B":
                intmark2=markarr[4];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "B-":
                intmark2=markarr[5];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "C+":
                intmark2=markarr[6];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "C":
                intmark2=markarr[7];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "C-":
                intmark2=markarr[8];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "D+":
                intmark2=markarr[9];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "D":
                intmark2=markarr[10];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "D-":
                intmark2=markarr[11];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();
            case "E":
                intmark2=markarr[12];
                total2=intmark2*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total2,Toast.LENGTH_SHORT).show();


        }

        ArrayAdapter<String> adapter_m3= new ArrayAdapter<>(gpa_calculation_s1.this, android.R.layout.simple_spinner_item,marks);
        adapter_m1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m3.setAdapter(adapter_m3);
        m3.setSelection(0);

        String selected_m3=m3.getSelectedItem().toString().trim();

        switch (selected_m3){

            case "A+":
                intmark3=markarr[0];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "A":
                intmark3=markarr[1];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "A-":
                intmark3=markarr[2];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "B+":
                intmark3=markarr[3];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "B":
                intmark3=markarr[4];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "B-":
                intmark3=markarr[5];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "C+":
                intmark3=markarr[6];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "C":
                intmark3=markarr[7];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "C-":
                intmark3=markarr[8];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "D+":
                intmark3=markarr[9];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "D":
                intmark3=markarr[10];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "D-":
                intmark3=markarr[11];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();
            case "E":
                intmark3=markarr[12];
                total3=intmark3*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total3,Toast.LENGTH_SHORT).show();


        }

        ArrayAdapter<String> adapter_m4= new ArrayAdapter<>(gpa_calculation_s1.this, android.R.layout.simple_spinner_item,marks);
        adapter_m1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m4.setAdapter(adapter_m4);
        m4.setSelection(0);

        String selected_m4=m4.getSelectedItem().toString().trim();

        switch (selected_m4){

            case "A+":
                intmark4=markarr[0];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "A":
                intmark4=markarr[1];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "A-":
                intmark4=markarr[2];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "B+":
                intmark4=markarr[3];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "B":
                intmark4=markarr[4];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "B-":
                intmark4=markarr[5];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "C+":
                intmark4=markarr[6];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "C":
                intmark4=markarr[7];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "C-":
                intmark4=markarr[8];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "D+":
                intmark4=markarr[9];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "D":
                intmark4=markarr[10];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "D-":
                intmark4=markarr[11];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();
            case "E":
                intmark4=markarr[12];
                total4=intmark4*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total4,Toast.LENGTH_SHORT).show();


        }

        ArrayAdapter<String> adapter_m5= new ArrayAdapter<>(gpa_calculation_s1.this, android.R.layout.simple_spinner_item,marks);
        adapter_m1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m5.setAdapter(adapter_m5);
        m5.setSelection(0);

        String selected_m5=m5.getSelectedItem().toString().trim();

        switch (selected_m5){

            case "A+":
                intmark5=markarr[0];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "A":
                intmark5=markarr[1];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "A-":
                intmark5=markarr[2];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "B+":
                intmark5=markarr[3];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "B":
                intmark5=markarr[4];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "B-":
                intmark5=markarr[5];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "C+":
                intmark5=markarr[6];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "C":
                intmark5=markarr[7];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "C-":
                intmark5=markarr[8];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "D+":
                intmark5=markarr[9];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "D":
                intmark5=markarr[10];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "D-":
                intmark5=markarr[11];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();
            case "E":
                intmark5=markarr[12];
                total5=intmark5*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total5,Toast.LENGTH_SHORT).show();


        }

        ArrayAdapter<String> adapter_m6= new ArrayAdapter<>(gpa_calculation_s1.this, android.R.layout.simple_spinner_item,marks);
        adapter_m1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m6.setAdapter(adapter_m6);
        m6.setSelection(0);

        String selected_m6=m6.getSelectedItem().toString().trim();

        switch (selected_m6){

            case "A+":
                intmark6=markarr[0];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "A":
                intmark6=markarr[1];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "A-":
                intmark6=markarr[2];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "B+":
                intmark6=markarr[3];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "B":
                intmark6=markarr[4];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "B-":
                intmark6=markarr[5];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "C+":
                intmark6=markarr[6];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "C":
                intmark6=markarr[7];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "C-":
                intmark6=markarr[8];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "D+":
                intmark6=markarr[9];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "D":
                intmark6=markarr[10];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "D-":
                intmark6=markarr[11];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();
            case "E":
                intmark6=markarr[12];
                total6=intmark6*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total6,Toast.LENGTH_SHORT).show();


        }

        ArrayAdapter<String> adapter_m7= new ArrayAdapter<>(gpa_calculation_s1.this, android.R.layout.simple_spinner_item,marks);
        adapter_m1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m7.setAdapter(adapter_m7);
        m7.setSelection(0);

        String selected_m7=m7.getSelectedItem().toString().trim();

        switch (selected_m7){

            case "A+":
                intmark7=markarr[0];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "A":
                intmark7=markarr[1];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "A-":
                intmark7=markarr[2];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "B+":
                intmark7=markarr[3];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "B":
                intmark7=markarr[4];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "B-":
                intmark7=markarr[5];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "C+":
                intmark7=markarr[6];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "C":
                intmark7=markarr[7];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "C-":
                intmark7=markarr[8];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "D+":
                intmark7=markarr[9];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "D":
                intmark7=markarr[10];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "D-":
                intmark7=markarr[11];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();
            case "E":
                intmark7=markarr[12];
                total7=intmark7*(Double.parseDouble(c1.getText().toString()));
                Toast.makeText(gpa_calculation_s1.this,"Totalmark="+total7,Toast.LENGTH_SHORT).show();


        }

    }


}