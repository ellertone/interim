package com.binarysearch;

public class Ceiling {
    public static void main(String[] args) {
//        int[] arr2 = {987, 876, 765, 654, 543, 423, 321, 210, 98, 87, 76, 65, 54, 43, 32, 21, 10, 9, 8, 6, 4, 3, 1, 0};
        int[] arr = {-12, -11, -4, -2, 0, 12, 23, 34, 56, 67, 78, 90, 123, 234, 345, 456, 567, 678, 789, 890};
        int target = 211;

//        int target = 145;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] > target) {
            return target = arr[start];
        }

            while (start <= end) {
                // find the middle element
                // int mid = (start+ end) /2; // might be possible that range is exceeded for large integers
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
            return arr[start];
        }
    }
}