package com.example.sliitguru;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class linkerDbHelper extends SQLiteOpenHelper {
    public linkerDbHelper(@Nullable Context context) {
        super(context, "linkerdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
    DB.execSQL("create TABLE linkerdetails(title TEXT primary key, link TEXT, description TEXT  )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
    DB.execSQL("drop TABLE if exists linkerdetails");
    }

    public Boolean insertlinkerdata(String title, String link, String description ){

        SQLiteDatabase DB= this.getReadableDatabase();

         ContentValues contentValues= new ContentValues();
            contentValues.put("title",title);
            contentValues.put("link",link);
            contentValues.put("description",description);
            long result=DB.insert("linkerdetails",null,contentValues);
            if(result==-1){
                return false;
            }
            else {
                return true;
            }




    }

    public Cursor getdata(){
        SQLiteDatabase DB = this.getReadableDatabase();
        Cursor cursor= DB.rawQuery("Select * from linkerdetails",null);
        return cursor;
    }
}
