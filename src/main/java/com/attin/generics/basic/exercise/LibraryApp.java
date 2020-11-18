package com.attin.generics.basic.exercise;

import com.attin.generics.basic.exercise.algorthmImpl.GraphAlgorithm;
import com.attin.generics.basic.exercise.algorthmImpl.SearchAlgorithm;
import com.attin.generics.basic.exercise.algorthmImpl.SortingAlgorithm;

public class LibraryApp {

    public static void main(String[] args) {

        Library<Algorithm> library = new Library<>();
        library.add(new SearchAlgorithm());
        library.add(new SortingAlgorithm());
        library.add(new GraphAlgorithm());

        Algorithm item = library.getLast();
        while (item != null) {
            item.execute();
            item = library.getLast();
        }
    }

}
