package com.leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-11, -4, -2, 0, 12,23, 34, 56, 67, 78, 90, 123, 234, 345, 456, 567, 678, 789,890};
        
        int target = 123;
        int ans = binarySearch(arr, target, 0, arr.length - 1);

        System.out.println(ans);
        
    }

    // return index 
    // return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target, int start, int end ){

        while (start <= end){
            int mid = start + (end - start) /2 ;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
}