package com.pilot.dan.gamescore.database;

/**
 * Created by dan on 9/23/15.
 */


public class player {

    private int     _id;
    private String  name;
    private String  picture;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
