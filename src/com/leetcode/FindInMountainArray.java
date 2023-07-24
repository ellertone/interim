package com.leetcode;

public class FindInMountainArray {
    public static void main(String[] args) {

    }

    int search( int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = agnosticBinSearch(arr, target, 0, peak );
        if (firstTry != - 1){
            return firstTry ;
        }
        //search in second half
        return agnosticBinSearch(arr, target, peak + 1, arr.length - 1 );

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) /2;

            if (arr[mid] > arr[mid + 1 ]) {
                //Decreasing part of the array
                // may be ans but look at left part
                // why end != mid - 1

                end = mid;
            } else {
                //This is the ascending part of the array
                start = mid + 1; // mid +1 element is greater than mid
            }
        }
        /*
        In the end, start == end pointing to the largest element
        start and end always try to find the max element in each check
         when both point to the same that is the center
        */
        return start; // or end
    }

    int agnosticBinSearch(int[] arr, int target, int start, int end){


        // find whether the array is sorted or not
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            // find the middle element
            // int mid = (start+ end) /2; // might be possible that range is exceeded for large integers
            int mid = start + (end - start) /2 ;


//            check the boolean conditions based on sorting order.
            // if mid = target this is common to reduce the difference
            if (arr[mid] == target ){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if (target >  arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


