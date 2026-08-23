import java.util.*;




// Climbing Stairs


// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps



// class Solution {
//     public int climbStairs(int n) {
//         int t1 = 1;
//         int t2 = 2;
//         if(n == 1){
//             return t1;
//         }
//         if(n == 2){
//             return t2;
//         }
//         int summ = 0;
//         for(int i = 3; i <= n; i++){
//             summ = t1 + t2;
//             t1 = t2;
//             t2 = summ;
//         }
//         return summ;
//     }
// }

















//House Robber

// ou are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

// Example 1:
// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.


class Solution {
    public int rob(int[] nums) {
        int prevRob = 0;
        int maxRob = 0;

        for (int curValue : nums) {
            int temp = Math.max(maxRob, prevRob + curValue);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;        
    }
}