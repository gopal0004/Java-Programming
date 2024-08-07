package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public String toString(){
        return "Student [rollNo=" + rollNo + ", name=" + name +"]";
    }
}

public class C1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(001, "Gopal"));
        list.add(new Student(002, "Rohit"));
        list.add(new Student(39, "Shailesh"));
        list.add(new Student(27, "Lord"));
        list.add(new Student(3, "RainA"));

        System.out.println("List is : " + list);
        // Collections.sort(list);
        // System.out.println("Sorted List : " + list);

        // //sorting list by last digit to do this implement Comparator
        // Comparator<Integer> c = new Comparator<Integer>() {
        //     public int compare(Integer a,Integer b){
        //         if(a%10 > b%10){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };

        // sorting student by age
        Comparator<Student> c = new Comparator<Student>() {
            public int compare(Student a,Student b){
                if(a.rollNo > b.rollNo){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Collections.sort(list,c); //we have to pass our Comparator obj in sort method;
        System.out.println("sorted by last digit : "+list);
    }
}
