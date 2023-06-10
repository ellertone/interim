package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        /*
            1 2 3 4
            5 6 7 8
         */

        Scanner in = new Scanner(System.in);
//        int arr[][] =new int[3][]; // row number is mandatory
//
//        int [][] arr2D = {
//                {1,1,1}, //0th index
//                {2,2,2} , // 1st index
//                {3,3,3}, //2nd index -> arr2D[2] = {3,4,5} --> arr2D[2] [1] = 4
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
