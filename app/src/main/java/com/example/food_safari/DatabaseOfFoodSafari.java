package com.example.food_safari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseOfFoodSafari extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "FoodSafariDataBase";
    public static final String TABLE_NAME = "Restaurant";
    public static final String Col_1 = "Rest_ID";
    public static final String Col_2 = "Rest_Name";
    public static final String Col_3 = "Rest_Address";
    public static final String Col_4 = "Rest_Availability";


    public DatabaseOfFoodSafari(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table " + TABLE_NAME + " (Rest_ID INTEGER PRIMARY KEY AUTOINCREMENT, Rest_Name TEXT, Rest_Adress TEXT, Rest_Availability TEXT )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" Drop Table " + TABLE_NAME);
        onCreate(db);

    }
}
