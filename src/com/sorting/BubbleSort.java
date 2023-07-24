package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //for already sorted arrays//
        boolean swapped;

        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, the largest element will be at the end
            for (int j = 1; j < arr.length - i ; j++) {
                //swap if j < previous item i.e j-1
                if (arr[j] < arr[j -1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if no swap occurs for a value of i, array is sorted
            if (!swapped){ //!false = true
                break;
            }
        }
    }
}
