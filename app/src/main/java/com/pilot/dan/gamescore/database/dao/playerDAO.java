package com.pilot.dan.gamescore.database.dao;

import android.content.ContentValues;
import android.content.Context;

import com.pilot.dan.gamescore.database.MySQLiteHelper;
import com.pilot.dan.gamescore.database.player;

import java.sql.SQLException;

/**
 * Created by dan on 9/23/15.
 */
public class playerDAO extends TemplateDAO {

    private String[] allCollumns = {MySQLiteHelper.TABLE_PLAYE_ID,
                                    MySQLiteHelper.TABLE_PLAYER_NAME,
                                    MySQLiteHelper.TABLE_PLAYER_PICTURE};

    private Context context;

    public playerDAO(Context context) {
        super(context);
        this.context = context;
    }

    public player createPlayer(String name,String picture) throws SQLException{

        player new_player = new player();

        NextNumberDAO nnDAO = new NextNumberDAO(context);
        new_player.set_id((int)nnDAO.getNextNumber(NextNumberDAO.Player));

        // set the record information
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.TABLE_PLAYE_ID, new_player.get_id());
        values.put(MySQLiteHelper.TABLE_PLAYER_NAME, new_player.getName());
        values.put(MySQLiteHelper.TABLE_PLAYER_PICTURE, new_player.getPicture());

        database.insert(MySQLiteHelper.TABLE_PLAYER,null, values);

        new_player.setName(name);
        new_player.setPicture(picture);

        return new_player;

    }

}
