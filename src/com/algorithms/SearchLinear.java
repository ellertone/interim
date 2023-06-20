package com.algorithms;

import java.util.Scanner;

public class SearchLinear {
    public static void main(String[] args) {
        int[] nums ={ 1, 2,4, 44 ,65, 35, 64, 12, 56,  75, 36, 35, 87};
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Number you wanna Search for: ");
        int target = in.nextInt();
        int ans = Linears(nums, target);
        System.out.println(ans);
    }

    //search in the array
    //If not found return -1 if not found
    static int Linears(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
    return Integer.MAX_VALUE;
    }
}