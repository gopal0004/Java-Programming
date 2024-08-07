package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

// 2. Create a HashSet of 5 names. Write a menu driven program to do the following:
// a. Add a new name
// b. Remove a name
// c. Search a name
// d. Display all the names (display in reverser order also – use ListIterator )
// e. Display number of elements in hashSet

public class Q6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        char choice;

        do{
            System.out.println("a. Add a new name");
            System.out.println("b. Remove a name");
            System.out.println("c. Search a name");
            System.out.println("d. Display all the names");
            System.out.println("e. Display all the names reverse");
            System.out.println("f. Display number of elements in hashSet");
            System.out.println("g. exit");

            System.out.println("Enter choice");
            choice = sc.next().charAt(0);

            switch(choice){
                case 'a':
                    addName(set);
                    break;
                case 'b':
                    remove(set);
                    break;
                case 'c':
                    search(set);
                    break;
                case 'd':
                    display(set);
                    break;
                case 'e':
                    reverse(set);
                    break;
                case 'f':
                    counter(set);
                    break;
                case 'g':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }while(choice != 'g');
     }

    public static void addName(HashSet<String> set){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name to add");
        String name =sc.nextLine();
        set.add(name);
    }

    public static void remove(HashSet<String> set){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name to remove");
        String name = sc.nextLine();
        if(set.contains(name)){
            set.remove(name);
        }else{
            System.out.println("cant't find");
        }
    }

    public static void search(HashSet<String> set){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to search");
        String name = sc.nextLine();
        if(set.contains(name)){
            System.out.println("Exist");
        }else{
            System.out.println("Not exist");
        }
    }

    public static void display(HashSet<String> set){
        ArrayList<String> lst = new ArrayList<>(set);
        ListIterator<String> i = lst.listIterator();

        System.out.println("Details");
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void reverse(HashSet<String> set){
        ArrayList<String> lst = new ArrayList<>(set);
        ListIterator<String> i = lst.listIterator(set.size());

        System.out.println("Details in reverse");
        while(i.hasPrevious()) {
            System.out.println(i.previous());
        }
    }

    public static void counter(HashSet<String> set){
        int count=0;
        for (String str : set) {
            if(!str.isEmpty()){
                count+=1;
            }
        }
        System.out.println("the number of elements are " + count);
    }
}
