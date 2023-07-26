package com.sorting;

class RepeatedNumber {
    public int findDuplicate(int[] arr) {
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

        //check for the duplicate num

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 ) {
                return arr[index];
            }
        }
        return -1;
    }


        


     void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}