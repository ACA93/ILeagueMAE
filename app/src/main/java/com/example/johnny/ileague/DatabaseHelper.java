package com.example.johnny.ileague;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "ileague.db";
    public static final String TABLE_NAME = "student_table";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "Mannschaft";
    public static final String COL_3 = "Punkte";
    public static final String COL_4 = "Siege";
    public static final String COL_5 = "Unentschieden";
    public static final String COL_6 = "Niederlage";
    public static final String COL_7 = "Tore";
    public static final String COL_9 = "Gegentore";
    public static final String COL_10 = "Tordifferenz";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " +  TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,Mannschaft TEXT, Punkte INTEGER, Siege int, Unentschieden INTEGER, Niederlage INTEGER, Tore INTEGER, Gegentore INTEGER, Tordifferenz INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int i1) {


        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

        
    }
}
