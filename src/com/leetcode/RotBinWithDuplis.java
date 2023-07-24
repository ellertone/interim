package com.leetcode;

public class RotBinWithDuplis {
    public static void main(String[] args) {

    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end ){
            int mid = start + (end - start) /2 ;
            //4 cases tested here
            if (mid < end && arr[mid] > arr[mid +1 ]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid -1 ]) {
                return mid - 1;
            }
            //if elements at start,middle ,end are equal, skip the duplicates

            if (arr[mid]== arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //check if they are the pivots

                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end - 1] < arr[end]) {
                    return end - 1;  // we skip the duplicate end
                }
                end--;
            }
            //left side is sorted so move onto the tight
        }
        return -1;
    }
}
