package com.leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 0, 1, 2};

        System.out.println(missingNumber(arr));
    }
    // sort the array except the missing value
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct =  arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct] ){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        //case 2
        return arr.length;

    }
    
  

    //search for first missing number


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
