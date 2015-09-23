package com.pilot.dan.gamescore.database.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.pilot.dan.gamescore.database.MySQLiteHelper;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by dan on 9/23/15.
 */
public class TemplateDAO {

    protected SQLiteDatabase database;
    protected MySQLiteHelper dbHelper;

    protected TemplateDAO() {};

    public TemplateDAO(Context context) {
        dbHelper = new MySQLiteHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public  void close() {
        database.close();
    }

    static protected String convertDateToString(Date date) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        return dateFormat.format(date);
    }

    static protected Date convertStringToDate(String date) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date ret;
        try {
            ret = dateFormat.parse(date);
        } catch (ParseException e) {
            ret = null;
        }

        return ret;
    }

}
