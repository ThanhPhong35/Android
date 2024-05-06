package com.example.navigationkt.model;

public class Song {
    private int id;
    private String song, singer, album, type;
    private int isFavorite;

    public Song() {
    }

    public Song(int id, String song, String singer, String album, String type, int isFavorite) {
        this.id = id;
        this.song = song;
        this.singer = singer;
        this.album = album;
        this.type = type;
        this.isFavorite = isFavorite;
    }

    public Song(String song, String singer, String album, String type, int isFavorite) {
        this.song = song;
        this.singer = singer;
        this.album = album;
        this.type = type;
        this.isFavorite = isFavorite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(int isFavorite) {
        this.isFavorite = isFavorite;
    }
}
