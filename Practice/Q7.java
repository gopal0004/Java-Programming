package Practice;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// 2) Write a generic class Stack<T> that can be used to represent stacks of objects of type T. The class
// should include methods push(), pop(), and isEmpty(). Inside the class, use an ArrayList to hold the
// items on the stack.

public class Q7<T> {
    Stack<T> stk = new Stack<>();

    public boolean isEmpty(){
        return stk.isEmpty();
    }

    public void push(T data){
        stk.push(data);
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return stk.pop();
    }

    public static void main(String[] args) {
        Q7<Integer> obj1 = new Q7<>();
        obj1.push(11);
        obj1.push(12);

        Q7<String> obj2 = new Q7<>();
        obj2.push("Gopal");
        obj2.push("Shailesh");
        obj2.pop();
        obj2.isEmpty();
    
        Stack<Q7> stk = new Stack<>();
        stk.push(obj1);
        stk.push(obj2);

        for(int i=0;i<stk.size();i++){
            System.out.println(stk.get(i));
        }
    }
}


