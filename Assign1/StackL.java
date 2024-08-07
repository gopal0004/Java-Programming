package DSA;

import java.util.*;

class Stack {
    int data;
    Stack next;
    Stack top;

    public void Push() {
        Scanner sc = new Scanner(System.in);
        int data;
        Stack new_node = new Stack();
        System.out.println("enter element to push");
        data = sc.nextInt();

        new_node.data = data;
        new_node.next = top;
        top = new_node;
        sc.close();
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack underflow");
        } else {
            System.out.println(top.data);
            top = top.next;
        }
    }

    public void display() {
        Stack ptr = new Stack();
        ptr = top;

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack's elements are ");
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();

        Stack ptr2 = new Stack();
        ptr2 = ptr;

        System.out.println("Reverse");
        while (ptr2 != null) {
            System.out.print(ptr2.data + " ");
            ptr2 = ptr2.next;
        }
    }

}

public class StackL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Stack s = new Stack();

        do {
            System.out.println("Enter choice");

            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.Push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}
