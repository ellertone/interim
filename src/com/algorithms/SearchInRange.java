package com.algorithms;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums ={ 1, 2,4, 44 ,65, 35, 64, 12, 56,  75, 36, 35, 87};
//        Scanner in =new Scanner(System.in);
//        System.out.print("Enter the Number you wanna Search for: ");
        int target =   14;             //in.nextInt();
        int ans = Linear(nums, target, 6 , 9);
        System.out.println(ans);
    }

    static int Linear(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = start; index <= end; index++) {
//            check the element at every index if equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
