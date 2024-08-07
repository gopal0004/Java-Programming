package DSA;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("abc", 68);
        student.put("bcd", 78);
        student.put("cde", 87);
        student.put("def", 89);

        // printing key
        // for (String s : student.keySet()) {
        // System.out.print("keys : " + s);
        // }

        // printing keys&values
        for (String key : student.keySet()) {
            System.out.println(key + " : " + student.get(key));
        }
        System.out.println(student);
    }
}
