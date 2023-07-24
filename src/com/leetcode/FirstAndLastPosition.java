package com.leetcode;
// leetcode no 34

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

     int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        //this function return the index value of target
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }


    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start+ end) /2; // might be possible that range is exceeded for large integers
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) { //can remove the option true since boolean default is true if exists
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}