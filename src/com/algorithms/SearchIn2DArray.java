package com.algorithms;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {21, 4, 1},
                {13,54, 32},
                {12,45,76,87},
                {21, 34}
        };
        int target = 87;
        int[] ans = search(arr, target); // format of return val = array with {row, column}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{ row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }
//Checking the max value
    static int max(int[][] arr){
        int maxNum =  Integer.MIN_VALUE; //arr [0][0];
        for (int[] row : arr) {
            for (int element : row) {
                if (element > maxNum) {
                    maxNum = element;
                }
            }

        }
        return maxNum;
    }
}
