package DSA;

import java.util.*;

class Implement {
    // int size;
    int top = -1;
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);

    public void push() {
        System.out.println("enter elements to push ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            top++;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("popped element is : " + arr[top]);
        top--;
        System.out.println(arr[top]);
    }

    public void traversal() {
        if (top == -1) {
            System.out.println("Stack is empty ");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Implement i = new Implement();
        i.push();
        i.pop();
        i.traversal();
    }
}
