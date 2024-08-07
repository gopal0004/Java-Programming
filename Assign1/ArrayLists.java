package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // adding
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);

        // removing
        list.remove(1);

        // get
        list.get(0);

        // set
        list.set(1, 4);

        System.out.println("List is " + list);
        System.out.println("Reversed list " + list.reversed());
        Collections.sort(list);
        System.out.println(" sorted List is " + list);
        System.out.println("the size of List is " + list.size());
        System.out.println("for each");
        list.forEach(n -> System.out.println(n));
    }
}
