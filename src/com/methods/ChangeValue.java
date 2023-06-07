package com.methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create array
        int[] arr = {1,3 ,4, 2,53, 90};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] nums) {
        nums[0]= 99;

    }

}
