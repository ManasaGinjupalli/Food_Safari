package com.example.food_safari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseOfFoodSafari extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "FoodSafariDataBase";
    private static final String TABLE_NAME1 = "Restaurant";
    private static final String Col_1 = "Res_ID";
    private static final String Col_2 = "Res_Name";
    private static final String Col_3 = "Res_Address";
    private static final String Col_4 = "Res_Availability";
    private static final String TABLE_NAME2 = "Order";
    private static final String Col_5 = "Order_ID";
    private static final String Col_6 = "Res_ID";
    private static final String Col_7 = "Cust_ID";
    private static final String TABLE_NAME3 = "Payment";
    private static final String Col_8 = "Payment_ID";
    private static final String Col_9 = "Cust_ID";
    private static final String TABLE_NAME4 = "Delivery";
    private static final String Col_10 = "Delivery_ID";
    private static final String Col_11 = "Res_ID";
    private static final String Col_12 = "Cust_ID";
    private static final String Col_13 = "Delivery_Address";
    private static final String Col_14 = "DeliveryMan";
    private static final String Col_15 = "Delivery_Phone";
    private static final String TABLE_NAME5 = "Promotion";
    private static final String Col_16 = "Promotion_ID";
    private static final String Col_17 = "Payment_ID";
    private static final String Col_18 = "Promotion_Discount";
    private static final String TABLE_NAME6 = "Customer";
    private static final String Col_19 = "Cust_ID";
    private static final String Col_20 = "Cust_Name";
    private static final String Col_21 = "Cust_Address";
    private static final String Col_22 = "Cust_Cart";
    private static final String TABLE_NAME7 = "Menu";
    private static final String Col_23 = "Menu_ID";
    private static final String Col_24 = "Res_ID";
    private static final String TABLE_NAME8 = "Food_Item";
    private static final String Col_25 = "Item_ID";
    private static final String Col_26 = "Menu_ID";
    private static final String Col_27 = "Item_Name";
    private static final String Col_28 = "Item_Description";
    private static final String Col_29 = "Price";


    public DatabaseOfFoodSafari(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    private static final String CREATE_RESTAURANT = "CREATE TABLE "
            + TABLE_NAME1 + "(" + Col_1 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Col_2
            + " TEXT," + Col_3 + " TEXT," + Col_4 + " TEXT" + ")";


    private static final String CREATE_ORDER = "CREATE TABLE "
            + TABLE_NAME2 + "(" + Col_5 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Col_6
            + " INTEGER," +  Col_7 + " INTEGER" + ")";

    private static final String CREATE_PAYMENT = "CREATE TABLE "
            + TABLE_NAME3 + "(" + Col_8 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Col_9
            + " INTEGER" + ")";

    private static final String CREATE_DELIVERY = "CREATE TABLE "
            + TABLE_NAME4 + "(" + Col_10 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Col_11
            + " INTEGER," + Col_12 + " INTEGER," + Col_13 + " TEXT"
            + Col_14 + "TEXT," + Col_15 + " INTEGER" + ")";

    private static final String CREATE_PROMOTION = "CREATE TABLE "
            + TABLE_NAME5 + "(" + Col_16 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Col_17
            + " INTEGER," + Col_18 + " TEXT" + ")";

    private static final String CREATE_CUSTOMER = "CREATE TABLE "
            + TABLE_NAME6 + "(" + Col_19 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Col_20
            + " TEXT," + Col_21 + " TEXT," + Col_22
            + " TEXT" + ")";

    private static final String CREATE_MENU = "CREATE TABLE "
            + TABLE_NAME7 + "(" + Col_23 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Col_24
            + "INTEGER" + ")";

    private static final String CREATE_FOOD_ITEM = "CREATE TABLE "
            + TABLE_NAME8 + "(" + Col_25 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Col_26
            + " INTEGER," + Col_27 + " TEXT," + Col_28
            + " TEXT" +  Col_29 + "INTEGER" + ")";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_RESTAURANT);
        db.execSQL(CREATE_ORDER);
        db.execSQL(CREATE_PAYMENT);
        db.execSQL(CREATE_DELIVERY);
        db.execSQL(CREATE_PROMOTION);
        db.execSQL(CREATE_CUSTOMER);
        db.execSQL(CREATE_MENU);
        db.execSQL(CREATE_FOOD_ITEM);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS  CREATE_RESTAURANT");
        db.execSQL(" DROP TABLE IF EXISTS CREATE_ORDER ");
        db.execSQL(" DROP TABLE IF EXISTS CREATE_PAYMENT " );
        db.execSQL(" DROP TABLE IF EXISTS CREATE_DELIVERY ");
        db.execSQL(" DROP TABLE IF EXISTS CREATE_PROMOTION ");
        db.execSQL(" DROP TABLE IF EXISTS CREATE_CUSTOMER ");
        db.execSQL(" DROP TABLE IF EXISTS CREATE_MENU " );
        db.execSQL(" DROP TABLE IF EXISTS CREATE_FOOD_ITEM ");
        onCreate(db);

    }
}
