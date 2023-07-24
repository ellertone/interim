package com.binarysearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};

        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target ){
        //
        int start = 0;
        int end = 1;

        //condition for target to lie in range
        while (target > arr[end] ){
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeof box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
