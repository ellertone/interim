package com.algorithms;
// problem 1672 leetcode
public class maxWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts){
      // person == row , account = columns
        //create overall answer

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int personSum = 0;
            for (int account = 0; account < accounts[person].length; account++)
            {
                personSum += accounts[person][account];
            }
                //   now we have sum of accounts for each person
            if ( personSum > ans)
            {
                ans = personSum;
            }
        }
        return ans;
    }
}
