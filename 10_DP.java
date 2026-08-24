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


// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n];
//         dp[0] = nums[0];
//         int take = 0;
//         int nottake = 0;
//         for(int i = 1; i < n; i++){
//             take = nums[i];
//             if(i > 1) take += dp[i - 2];
//             nottake = 0 + dp[i - 1];
//             dp[i] = Math.max(take, nottake);
//         }
//         return dp[n - 1];
//     }
// }










//Robber II

//Circular mai houses and first andd last house are adjacent so we can not rob both of them. So we will take max of robbing first house and not robbing last house and robbing last house and not robbing first house.



class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        int take = 0;
        int ntake = 0;
        int p = 0;
        int t = 0;
        for(int i = 1; i < n - 1; i++){
            take = nums[i];
            if(i > 1) take += dp[i - 2];
            ntake = 0 + dp[i - 1];
            dp[i] = Math.max(take, ntake);
        } 
        p = dp[n - 2];
        take = 0;
        ntake = 0;
        dp[0] = 0;
        dp[1] = nums[1];
        for(int i = 2; i < n; i++){
            take = nums[i];
            if(i > 1) take += dp[i - 2];
            ntake = 0 + dp[i - 1];
            dp[i] = Math.max(take, ntake);
        } 
        t = dp[n - 1];
        return Math.max(p, t);
    }
}