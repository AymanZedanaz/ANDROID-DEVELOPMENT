package com.example.recyclerviewapp;

public class Movie {
    private String title, genre, data;

    public Movie(String title, String genre, String data) {
        this.title = title;
        this.genre = genre;
        this.data = data;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
