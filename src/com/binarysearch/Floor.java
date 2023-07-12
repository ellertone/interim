package com.binarysearch;

public class Floor {
        public static void main(String[] args) {
            int[] arr= {-12, -11, -4, -2, 0, 12, 23, 34, 56, 67, 78, 90, 123, 234, 345, 456, 567, 678, 789, 890};
//            int[] arr = { 2, 4, 5, 8, 12, 15, 20};
            int target = 1000;

//        int target = 145;
            int ans = floor(arr, target);
            System.out.println(ans);
        }

        static int floor(int[] arr, int target) {
            //if target is greater than the greatest element in the array ->


            int start = 0;
            int end = arr.length - 1;

            if (arr[end] < target) {
                return target = arr[end];

            } else {

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
                return arr[end];

            }
        }
}


