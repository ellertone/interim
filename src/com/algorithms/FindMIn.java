package com.algorithms;

public class FindMIn {
    public static void main(String[] args) {
        int[] arr ={ 21, 2, 4, 44 ,65, 35, 64, 12, 56, -7, 75, 36, 35, 87};
        System.out.println(min(arr));
    }
    //assume the array is not empty
    //return the minimum value of the array
    static int min(int[] arr){
      int minNum = arr[0];
      for (int i = 1; i < arr.length ; i++) {
            if (arr[i] <minNum)  {
                minNum = arr[i];
//                return minNum;
            }
        }
        return minNum;
    }
}
