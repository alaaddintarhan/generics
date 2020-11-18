package com.attin.generics.collection.exercise;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    //we are able to store  up to 5 items in the cache
    private int CAPACITY = 5;
    private List<Pair> cache;

    public Cache() {
        cache = new ArrayList<>(5);
    }

    public void search(String URL) {
        //we check if  given url is already searched for
        cache.stream().filter(pair -> pair.getURL().equals(URL)).findFirst().ifPresentOrElse(pair -> {
            //if the given item is already present in the cache
            //update the cache (because recently searched item are at the beginning of the array)
            cache.remove(pair);
            cache.add(0, pair);
        }, new Runnable() {
            @Override
            public void run() {
                //that the URL is not present in the cache
                //it is the first time we search  for a given URL
                Pair newPair = new Pair(URL, "Random content for the given URL");

                //we have to deal with the capacity as 5
                if (cache.size() >= CAPACITY)
                    cache.remove(CAPACITY - 1);
                //we have to check whether is it the first item in the array
                if (cache.size() == 0)
                    cache.add(newPair);
                else
                    cache.add(0, newPair);

            }
        });
    }

    public void showCache() {
        cache.stream().forEach(System.out::println);
    }
}
