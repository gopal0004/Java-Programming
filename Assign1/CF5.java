package Assign1;

import java.util.ArrayList;
import java.util.Stack;

// 2) Write a generic class Stack<T> that can be used to represent stacks of objects of type T. The class
// should include methods push(), pop(), and isEmpty(). Inside the class, use an ArrayList to hold the
// items on the stack.

public class CF5<T> {

    ArrayList<T> stack = new ArrayList<>();

    public void push(T item){
        stack.add(item);
    }
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        }
        return stack.remove(stack.size() - 1);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(18);
        stack.push(001);
        stack.push(264);

        System.out.println("pop element from the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        Stack<String> stack1 = new Stack<>();
        stack1.push("aa");
        stack1.push("bb");
        stack1.push("cc");
        stack1.push("dd");

        System.out.println("pop element from the stack:");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }

    }

}
