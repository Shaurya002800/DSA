import java.util.*;

//implementing Stack using Queue

// implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

// Implement the MyStack class:

// void push(int x) Pushes element x to the top of the stack.
// int pop() Removes the element on the top of the stack and returns it.
// int top() Returns the element on the top of the stack.
// boolean empty() Returns true if the stack is empty, false otherwise.
// Notes:

// You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
// Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.


// class MyStack {
//     Queue<Integer> q1=new LinkedList<>();
    
//     public MyStack() {
        
//     }
    
//     public void push(int x) {
//         q1.add(x);
//     }
    
//     public int pop() {
//         int n=q1.size();
//         for(int i=1;i<=n-1;i++){
//             q1.add(q1.remove());
//         }
//         return q1.remove();

//     }
    
//     public int top() {
//         int n=q1.size();
//         for(int i=1;i<=n-1;i++){
//             q1.add(q1.remove());
//         }
//         int p=q1.peek();

//         q1.add(q1.remove());
//         return p;

//     }
    
//     public boolean empty() {
//         if(q1.size()==0){
//             return true;
//         }
//         else return false;
//     }
// }





















// Implement Queue using Stacks

// Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

// Implement the MyQueue class:

// void push(int x) Pushes element x to the back of the queue.
// int pop() Removes the element from the front of the queue and returns it.
// int peek() Returns the element at the front of the queue.
// boolean empty() Returns true if the queue is empty, false otherwise.
// Notes:

// You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
// Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.




// class MyQueue {

//     Stack<Integer> input;
//     Stack<Integer> output;

//     public MyQueue() {
//         input = new Stack<>();
//         output = new Stack<>();
//     }
    
//     public void push(int x) {
//         input.push(x);
//     }
    
//     public int pop() {
//         if(output.empty()) {
//             while(!input.empty()) {
//                 output.push(input.pop());
//             }
//         }

//         return output.pop();
//     }
    
//     public int peek() {
//         if(output.empty()) {
//             while(!input.empty()) {
//                 output.push(input.pop());
//             }
//         }

//         return output.peek();
//     }
    
//     public boolean empty() {
//         return input.empty() && output.empty();
//     }
// }












//Valid Parentheses

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true





// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         for (int j = 0; j < s.length(); j++) {
//             char current = s.charAt(j);
//             if (current == '(' || current == '{' || current == '[') {
//                 stack.push(current);
//             } 
//             else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//                 char top = stack.pop();
//                 if ((current == ')' && top != '(') ||
//                     (current == '}' && top != '{') ||
//                     (current == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }        
//         return stack.isEmpty();
//     }
// }
























//MIN Stack

// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int value) pushes the element value onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.


// class MinStack {
//     Stack<Integer> stack;
//     Stack<Integer> minStack;

//     public MinStack() {
//         stack = new Stack<>();
//         minStack = new Stack<>();
//     }
    
//     public void push(int value) {
//         stack.push(value);

//         if(minStack.empty() || value <= minStack.peek()) {
//             minStack.push(value);
//         }
//     }
    
//     public void pop() {
//         int removed = stack.pop();

//         if(removed == minStack.peek()) {
//             minStack.pop();
//         }
//     }
    
//     public int top() {
//         return stack.peek();
//     }
    
//     public int getMin() {
//         return minStack.peek();
//     }
// }























//Next Greater Element I



// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

// You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

// For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

// Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

// Example 1:

// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
// - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
// - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.



// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         Stack<Integer> stack = new Stack<>();
//         for(int i = nums2.length - 1; i >= 0; i--) {
//             int curr = nums2[i];
//             while(!stack.empty() && stack.peek() <= curr) {
//                 stack.pop();
//             }
//             if(stack.empty()) {
//                 map.put(curr, -1);
//             } 
//             else {
//                 map.put(curr, stack.peek());
//             }
//             stack.push(curr);
//         }
//         int[] ans = new int[nums1.length];
//         for(int i = 0; i < nums1.length; i++) {
//             ans[i] = map.get(nums1[i]);
//         }
//         return ans;
//     }
// }


















//Sum of Subarray Minimums

// Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. Since the answer may be large, return the answer modulo 109 + 7.
 

// Example 1:

// Input: arr = [3,1,2,4]
// Output: 17
// Explanation: 
// Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
// Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
// Sum is 17.



class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        long ans = 0;
        for(int i = 0; i <= n; i++) {
            while(!stack.empty() && (i == n || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int left;
                if(stack.empty()) {
                    left = -1;
                } else {
                    left = stack.peek();
                }
                int right = i;
                long count = (long)(mid - left) * (right - mid);
                ans = (ans + arr[mid] * count) % MOD;
            }
            stack.push(i);
        }
        return (int) ans;
    }
}