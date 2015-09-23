package com.pilot.dan.gamescore.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dan on 9/23/15.
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

    // database parameters
    private static final String DATABASE_NAME = "gamescore.db";
    private static final int DATABASE_VERSION = 1;


    public static final String TABLE_NEXT_NUMBERS                   = "nextnumbers";
    public static final String COLLUMN_NN_ID                        = "_id";
    public static final String COLLUN_NN_VALUE                      = "value";

    private static final String CREATE_NEXT_NUMBER_TABLE =
            "create table "+TABLE_NEXT_NUMBERS+"("+
                    COLLUMN_NN_ID+" text primary key,"+
                    COLLUN_NN_VALUE+" integer);";

    public static final String TABLE_PLAYER                         = "players";
    public static final String TABLE_PLAYE_ID                       = "_id";
    public static final String TABLE_PLAYER_NAME                    = "name";
    public static final String TABLE_PLAYER_PICTURE                 = "picture";

    private static final String CREATE_PLAYER_TABLE =
            "create table "+TABLE_PLAYER+"("+
                    TABLE_PLAYE_ID+" integer primary key,"+
                    TABLE_PLAYER_NAME+" text,"+
                    TABLE_PLAYER_PICTURE+" text);";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(CREATE_NEXT_NUMBER_TABLE);
        database.execSQL(TABLE_PLAYER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {

    }
}
