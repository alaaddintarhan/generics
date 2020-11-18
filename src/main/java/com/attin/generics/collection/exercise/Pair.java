package com.attin.generics.collection.exercise;

public class Pair {
    private String URL;
    private String data;

    public Pair(String URL, String data) {
        this.URL = URL;
        this.data = data;
    }

    public String getURL() {
        return this.URL;
    }

    public String getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "URL='" + URL + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
