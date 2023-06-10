package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {45, 90, 898, 3, 799};
        Scanner in = new Scanner(System.in);
        int arr[]= new int[7];

//        System.out.println(arr [0]);
//        String[] str = new String[9];
//
//        System.out.println(str[0]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int num : arr) {// for every element in array print element
            System.out.print(num + " "); // num represents element of the array

        }

        System.out.println(Arrays.toString(arr));
    }
}
