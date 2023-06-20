package com.algorithms;

// problem 1295 leetcode

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {15,123,32451,1231,45745,6734,78,42345,234523};
        System.out.println(findNumbers(nums));
        System.out.println(digits(0));
        System.out.println(digits2(15168));
    }
//  Counting the numbers that meet the even specification
    static public int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){

            if (even(num) == true){
                count++;
            }
        }
        return count;
    }
//function to check whether  a number contains even digits or not
    static boolean even(int num) {
        int noOfDigits = digits(num);

//        if(noOfDigits % 2 == 0){
//            return true;
//        }
//        return false;

        return noOfDigits % 2 == 0; // simplified version

    }
//        count number of digits in a number
    static int digits(int num){
        int count = 0;
        if ( num < 0 ){
            num *= -1;
        }
        if( num == 0){
            return 1;
        }
        while (num > 0){
            count++;
            num = num / 10;
        }

        return count;
    }

    //Optimized version
    static int digits2(int num){
        if ( num < 0 ){
            num *= -1;
        }


        return (int)(Math.log10(num) + 1 );
    }

}
