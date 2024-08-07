package Assign1;

import java.util.Set;
import java.util.HashSet;


// 3) Create two hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie",
// "Kevin", "Michelle", "Ryan"}, and find their union, difference, and intersection.

public class CF6 {
    public static void main(String[] args) {
        

            Set<String> s1 = new HashSet<>();
            Set<String> s2 = new HashSet<>();
    
            s1.add("George");
            s1.add("Jim");
            s1.add("John");
            s1.add("Blake");
            s1.add("Kevin");
            s1.add("Michael");
    
            s2.add("George");
            s2.add("Kevin");
            s2.add("Michelle");
            s2.add("Ryan");
            s2.add("Katie");
    
            Set<String> un = new HashSet<>(s1);
            un.addAll(s2);
    
            Set<String> df = new HashSet<>(s1);
            df.removeAll(s2);
    
            Set<String> inter = new HashSet<>(s1);
            inter.retainAll(s2);
    
            System.out.println("Set 1: " + s1);
            System.out.println("Set 2: " + s2);
            System.out.println("Union: " + un);
            System.out.println("Difference: " + df);
            System.out.println("Intersection: " + inter);
    
    }
}
