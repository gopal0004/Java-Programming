package Assign1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

import java.util.Iterator;

// 2. Create a HashSet of 5 names. Write a menu driven program to do the following:
// a. Add a new name
// b. Remove a name
// c. Search a name
// d. Display all the names (display in reverser order also – use ListIterator )
// e. Display number of elements in hashSet

public class CF2 {

    public static void displayReverse(HashSet<String> set){
        List<String> list = new ArrayList<>(set);
        ListIterator<String> l =list.listIterator(list.size());
        System.out.println("Displaying elements in reverse order");
        while(l.hasPrevious()){
            System.out.println(l.previous());
        }
    }

    public static void display(HashSet<String> set){
        if(set.isEmpty()){
            System.out.println("Set is empty");
            return;
        }
        List<String> list =new  ArrayList<>(set);
        ListIterator<String> l = list.listIterator();

        System.out.println("Displaying elements of set");
        while(l.hasNext()){
            System.out.println(l.next());
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        HashSet<String> set=new HashSet<>();

        do{
            System.out.println("a. Add a new name");
            System.out.println("b. Remove a name");
            System.out.println("c. Search a name");
            System.out.println("d. Display all the names");
            System.out.println("e. display in reverser order");
            System.out.println("f. Display number of elements");
            System.out.println("g. Exit");

            System.out.println("enter choice");
            c=sc.next().charAt(0);
            sc.nextLine();
            
            switch (c) {
                case 'a':
                    System.out.println("enter name to add");
                    String name=sc.nextLine();
                    set.add(name);
                    break;
                case 'b':
                    System.out.println("enter name to remove");
                    String remove=sc.nextLine();
                    if(set.contains(remove)){
                        set.remove(remove);
                    }
                    else{
                        System.out.println("name does not exist");
                    }
                    break;
                case 'c':
                    System.out.println("enter name to search");
                    String search=sc.nextLine();
                    int counter=0;
                    boolean b =false;
                    for(String str : set){
                        if(str.equals(search)){
                            b=true;
                            break;
                        }
                        counter++;
                    }
                    if(set.contains(search)){
                        System.out.println(search + " is found at index : " + counter);
                    }else{
                        System.out.println("search not found");
                    }
                    break;
                case 'd':
                    display(set);
                    break;
                case 'e':
                    displayReverse(set);
                    break;
                case 'f':
                    Iterator i = set.iterator();
                    int count=0;
                    while(i.hasNext()){
                        count++;
                        i.next();
                    }
                    System.out.println("Total elements in set are : " + count);
                    break;
                case 'g':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(c != 'g');
    }
}