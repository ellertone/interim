package com.sorting;

public class SetMismatch645 {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        int[] ans = new int[2];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 ) {
                int rep =  arr[index];
                int mis = index + 1;
                ans[0] = rep;
                ans[1] = mis;
                return ans;
            }
        }
    return ans;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
