package com.arrays;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        /*syntax
        ArrayList<arr> list = new ArrayList<>();

         */
        ArrayList <Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);

        list.add(67);
        list.set(0 , 99);

        list.remove(4);
        System.out.println(list);




    }
}
