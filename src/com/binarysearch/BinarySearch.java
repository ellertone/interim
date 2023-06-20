package com.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-11, -4, -2, 0, 12,23, 34, 56, 67, 78, 90, 123, 234, 345, 456, 567, 678, 789,890};
        
        int target = 145;
        int ans = binarySearch(arr, target);

        System.out.println(ans);
        
    }

    // return index 
    // return -1 if it doesnt exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
          // find the middle element
          // int mid = (start+ end) /2; // might be possible that range is exceeded for large integers
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