package DSA;

import java.util.Scanner;

public class linkedList {

    class Node {
        String data;
        Node next;

    }

    Node head = null;
    static Scanner sc = new Scanner(System.in);

    public void insertFirst() {
        String data;
        Node new_node = new Node();
        System.out.println("Enter element to add first ");
        data = sc.next();
        new_node.data = data;
        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    public void insertEnd() {
        String data;
        Node new_node = new Node();
        System.out.println("Enter element to add last ");
        data = sc.next();
        if (head == null) {
            head = new_node;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        new_node.data = data;
        ptr.next = new_node;
        new_node.next = null;
    }

    public void insertAfter() {
        String data;
        Node new_node = new Node();
        System.out.println("Enter element to add After ");
        data = sc.next();
        System.out.println("Enter position to add after");
        String pos = sc.next();

        Node ptr = head;
        while (ptr != null & !ptr.data.equals(pos)) {
            ptr = ptr.next;
        }

        new_node.data = data;
        new_node.next = ptr.next;
        ptr.next = new_node;
    }

    public void insertBefore() {
        Node new_node = new Node();
        System.out.println("Enter element to add before ");
        String data = sc.next();
        System.out.println("Enter position to add before");
        String pos = sc.next();
        Node ptr = head;
        while (ptr != null && !ptr.next.data.equals(pos)) {
            ptr = ptr.next;
        }
        new_node.data = data;
        if (ptr != null) {
            new_node.next = ptr.next;
            ptr.next = new_node;
        } else {
            System.out.println("position not found");
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The List is empty ");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    public void deleteGiven() {
        // delete nth element from last and delete it

        if (head == null) {
            return;
        }
        int size = 0;
        Node ptr = head;
        while (ptr != null) {
            ptr = ptr.next;
            size++;
        }
        System.out.println("size of the list" + size);

        int indexToSearch = size - 2; // n is the index of element to delete
        Node prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    public void traversal() {
        Node ptr = head;
        System.out.println("List is : ");
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedList obj = new linkedList();
        int choice;
        do {
            System.out.println("Enter choice ");
            System.out.println("1.Insert At First");
            System.out.println("2.Insert At Last");
            System.out.println("3.Traversal");
            System.out.println("4.Insert After");
            System.out.println("5.Insert Before");
            System.out.println("6.Delete First");
            System.out.println("7.Delete Last");
            System.out.println("8.Delete Given");
            System.out.println("9.exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.insertFirst();
                    break;
                case 2:
                    obj.insertEnd();
                    break;
                case 3:
                    obj.traversal();
                    break;
                case 4:
                    obj.insertAfter();
                    break;
                case 5:
                    obj.insertBefore();
                    break;
                case 6:
                    obj.deleteFirst();
                    break;
                case 7:
                    obj.deleteLast();
                    break;
                case 8:
                    obj.deleteGiven();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 9);
    }
}
