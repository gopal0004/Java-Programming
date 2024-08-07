package DSA;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(00);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        System.out.println("by object " + set);

        System.out.println(set.contains(1));

        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();

        // iterator
        Iterator i = set.iterator();
        System.out.println("By iterator");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        Set<String> set2 = new HashSet<>();
        set2.add("abc");
        set2.add("abc"); // case sensitive
        System.out.println(set2);
        String str = "abc";
        System.out.println(str.hashCode());
        for (String s : set2) {
            if (s.hashCode() == str.hashCode()) {
                System.out.println("yes");
                continue;
            } else {
                System.out.println(s);
            }
        }
    }
}
