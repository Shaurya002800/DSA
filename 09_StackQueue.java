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




import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < s.length(); j++) {
            char current = s.charAt(j);
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((current == ')' && top != '(') ||
                    (current == '}' && top != '{') ||
                    (current == ']' && top != '[')) {
                    return false;
                }
            }
        }        
        return stack.isEmpty();
    }
}