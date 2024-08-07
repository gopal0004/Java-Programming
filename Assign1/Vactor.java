package DSA;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Vactor {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(1);
        v.addLast(2);
        v.set(1, null);
        System.out.println(v.size());
        v.remove(0); // also can remove by object v.remove(obj)
        v.get(0);
        System.out.println(v);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // addAll()
        v.addAll(0, arr);
        System.out.println("addAll vector : " + v);

        v.addElement(6); // add element at last
        System.out.println(v);
        System.out.println("Capacity : " + v.capacity());

        // v.clear(); // clear whole vector
        // System.out.println(v);

        // clone() method
        Object copy_vector = v.clone();
        System.out.println("clone vector : " + copy_vector);

        System.out.println("contains : " + v.contains(null)); // check contains null or not return boolean
        System.out.println("contains all : " + v.containsAll(arr));

        // v.copyInto(args); // to copy all elements into array (only array)

        Enumeration<Integer> e = v.elements(); // make series
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        v.ensureCapacity(5000); // giving capacity ,also can contain more than 5000
        System.out.println(v.capacity());
    }
}
