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
//         if(n == 2) return 2;
//         if(n == 1) return 1;
//         int[] dp = new int[n + 1];
//         dp[1] = 1;
//         dp[2] = 2;
//         for(int i = 3; i < n + 1; i++){
//             int ek = dp[i - 2];
//             int doo = dp[i - 1];
//             dp[i] = ek + doo;
//         }
//         return dp[n];
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



// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         if(n == 1) return nums[0];
//         if(n == 2) return Math.max(nums[0], nums[1]);
//         int[] dp = new int[n];
//         dp[0] = nums[0];
//         int take = 0;
//         int ntake = 0;
//         int p = 0;
//         int t = 0;
//         for(int i = 1; i < n - 1; i++){
//             take = nums[i];
//             if(i > 1) take += dp[i - 2];
//             ntake = 0 + dp[i - 1];
//             dp[i] = Math.max(take, ntake);
//         } 
//         p = dp[n - 2];
//         take = 0;
//         ntake = 0;
//         dp[0] = 0;
//         dp[1] = nums[1];
//         for(int i = 2; i < n; i++){
//             take = nums[i];
//             if(i > 1) take += dp[i - 2];
//             ntake = 0 + dp[i - 1];
//             dp[i] = Math.max(take, ntake);
//         } 
//         t = dp[n - 1];
//         return Math.max(p, t);
//     }
// }




















//Delete and Earn

// You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:

// Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
// Return the maximum number of points you can earn by applying the above operation some number of times.

// Example 1:

// Input: nums = [3,4,2]
// Output: 6
// Explanation: You can perform the following operations:
// - Delete 4 to earn 4 points. Consequently, 3 is also deleted. nums = [2].
// - Delete 2 to earn 2 points. nums = [].
// You earn a total of 6 points.



// class Solution {
//     public int deleteAndEarn(int[] nums) {
//         int maxVal = 0;
//         for (int x : nums) {
//             maxVal = Math.max(maxVal, x);
//         }
//         int[] points = new int[maxVal + 1];
//         for (int x : nums) {
//             points[x] += x;
//         }
//         if (maxVal == 0) return 0;
//         if (maxVal == 1) return points[1];
//         int[] dp = new int[maxVal + 1];
//         dp[0] = 0;
//         dp[1] = points[1];
//         for (int i = 2; i <= maxVal; i++) {
//             int take = points[i] + dp[i - 2];
//             int notTake = dp[i - 1];
//             dp[i] = Math.max(take, notTake);
//         }
//         return dp[maxVal];
//     }
// }


















//Unique Paths(Top-Down DP)

// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
// Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.


// Recursive Approach (without overlapping subproblems)

// class Solution {
//     public int uniquePaths(int m, int n) {
//         return solve(m - 1, n - 1);
//     }
//     public int solve(int i, int j){
//         if(i == 0 && j == 0){
//             return 1;
//         }
//         if(i < 0 || j < 0){
//             return 0;
//         }
//         int up = solve(i - 1, j);
//         int left = solve(i, j - 1);
//         return up + left;
//     }
// }



//Memoization Approach (with overlapping subproblems) but with extra space of O(m*n) for dp array
//(Top-Down DP)

// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];
//         for (int[] row : dp) Arrays.fill(row, -1);
//         return solve(m - 1, n - 1, dp);
//     }
    
//     public int solve(int i, int j, int[][] dp){
//         if(i == 0 && j == 0) return 1;
//         if(i < 0 || j < 0) return 0;
//         if(dp[i][j] != -1) return dp[i][j];
        
//         int up = solve(i - 1, j, dp);
//         int left = solve(i, j - 1, dp);
        
//         return dp[i][j] = up + left;
//     }
// }




//Tabulation Approach (Bottom-Up DP) with extra space of O(m*n) for dp array

// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];
//         for(int i = 0; i < m; i++){
//             int up = 0;
//             int left = 0;
//             for(int j = 0; j < n; j++){
//                 if(i == 0 && j == 0) dp[i][j] = 1;
//                 else{
//                     if(i > 0) up = dp[i - 1][j];
//                     if(j > 0) left = dp[i][j - 1];
//                     dp[i][j] = up + left;
//                 }
//             }
//         }
//         return dp[m - 1][n - 1];
//     }
// }




















// Unique Paths II

// You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
// An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
// Return the number of possible unique paths that the robot can take to reach the bottom-right corner.



class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                if(i == 0 && j == 0) obstacleGrid[i][j] = 1;
                else{
                    int up = 0;
                    int left = 0;
                    if(i > 0) up = obstacleGrid[i - 1][j];
                    if(j > 0) left = obstacleGrid[i][j - 1];
                    obstacleGrid[i][j] = up + left;
                }
            }
        }
        return obstacleGrid[m - 1][n - 1];
    }
}