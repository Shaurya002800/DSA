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


class MyStack {
    Queue<Integer> q1=new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int n=q1.size();
        for(int i=1;i<=n-1;i++){
            q1.add(q1.remove());
        }
        return q1.remove();

    }
    
    public int top() {
        int n=q1.size();
        for(int i=1;i<=n-1;i++){
            q1.add(q1.remove());
        }
        int p=q1.peek();

        q1.add(q1.remove());
        return p;

    }
    
    public boolean empty() {
        if(q1.size()==0){
            return true;
        }
        else return false;
    }
}