package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        arrays for non primitives
        Scanner in = new Scanner(System.in);
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
//        Modify
        str[0] = "Ellie";

        System.out.println(Arrays.toString(str));



    }
}
