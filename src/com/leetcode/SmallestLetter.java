package com.leetcode;
/*
Leetcode 744

exact same approach as ceiling
ignore equals i.e target is not the answer
 */

public class SmallestLetter {
    public static void main(String[] args) {
//        char[] letters = ["c","f","j"];
    }

    public char nextGreatestLetter(char[] letters, char target) {

            int start = 0;
            int end = letters.length - 1;


            while (start <= end) {
                // find the middle element
                // int mid = (start+ end) /2;
                int mid = start + (end - start) / 2;

                if (target < letters[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];

        }

    }

