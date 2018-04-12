package com.example.juanalvaropupo.androidvideogamelibrary;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

@Entity
public class VideoGame{

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String gameName;
    private String gameGenre;
    private String gameDescription;
    private boolean isCheckedOut;
    private Date date;

    public VideoGame(String gameName, String gameGenre, String gameDescription, boolean isCheckedOut, Date date) {
        this.gameName = gameName;
        this.gameGenre = gameGenre;
        this.gameDescription = gameDescription;
        this.isCheckedOut = isCheckedOut;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
