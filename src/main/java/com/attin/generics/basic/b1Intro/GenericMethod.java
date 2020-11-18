package com.attin.generics.basic.b1Intro;


import java.util.Arrays;

public class GenericMethod {

    public static <T> void showItem(T t) {
        System.out.print(" " + t.toString());
    }

    public static <T> T getItem(T t) {
        return t;
    }

    public static <T> void showArray(T[] t) {
        Arrays.stream(t).forEach(System.out::println);
    }

    public static void main(String[] args) {

        Integer[] integerArray = {1, 4, 9, 65, 456, 6, 8, 5};
        showArray(integerArray);

        String[] stringArray = {"Alaaddin", "Tarhan"};
        showArray(stringArray);

        Character[] charArray = {'A', 'l', 'a', 'a', 'd', 'd', 'i', 'n', 'T', 'a', 'r', 'h', 'a', 'n' };
        showArray(charArray);
    }


}
