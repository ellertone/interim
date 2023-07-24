package com.leetcode;

public class MountainArray {
    public static void main(String[] args) {

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
}
