package Generics;

import java.util.*;

public class Ex1 {
    
    double salary;
    String name; 

    public Ex1(double salary,String name){
        this.salary=salary;
        this.name=name;
    }

     @Override
    public String toString() {
        return "{name='" + name + "', salary=" + salary + "}";
    }

    public static void main(String[] args) {

        Ex1 e = new Ex1(45000, "Gopal");
        Ex1 e2=new Ex1(50000, "Shailesh");
        Ex1 e3 = new Ex1(25000, "Bhumit");
        
        List<Ex1> lst = new ArrayList<>();
        lst.add(e);
        lst.add(e2);
        lst.add(e3);


        Comparator<Ex1> c =(obj1,obj2) -> {
            if(obj1.salary > obj2.salary)
                return 1;
            else 
                return -1;
        };


        Collections.reverseOrder(c);
        System.out.println(lst.toString());
    }
}
