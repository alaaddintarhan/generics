package com.attin.generics.collection.exercise;

public class App {

    public static void main(String[] args) {

        Cache cache = new Cache();

        cache.search("www.google.com");
        cache.search("www.amazon.com");
        cache.search("www.facebook.com");
        cache.search("www.twitter.com");
        cache.search("www.bbc.com");
        cache.search("www.cnn.com");
        cache.search("www.twitter.com");
        cache.search("www.bbc.com");
        cache.search("www.cnn.com");

        cache.showCache();

    }
}
