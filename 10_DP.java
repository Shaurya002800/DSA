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



class Solution {
    public int climbStairs(int n) {
        int t1 = 1;
        int t2 = 2;
        if(n == 1){
            return t1;
        }
        if(n == 2){
            return t2;
        }
        int summ = 0;
        for(int i = 3; i <= n; i++){
            summ = t1 + t2;
            t1 = t2;
            t2 = summ;
        }
        return summ;
    }
}