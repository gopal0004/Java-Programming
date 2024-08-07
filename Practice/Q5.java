package Practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// 1. Write a program to read employee detail and store the employee object in linkedList. Sort the
// list based on salary.
// a. Create class- Employee (Attributes- empId, name , dob , salary : Methods: setDetails,
// getDetails and constructor )
// b. Employee class must implement comparable interface
// c. Create another class TestEmployee, here create the linkedList of employees and sort the
// list.



public class Q5 {
    public static void main(String[] args) {
        
        List<Employee> lst = new LinkedList<>();
        lst.add(new Employee(01, "Gopal", "01-03-2003", 45000));
        lst.add(new Employee(02, "Shailesh", "05-06-2003", 50000));
        lst.add(new Employee(03, "Bhumit", "12-12-2002", 30000));

        Collections.sort(lst);
        
        for (Employee employee : lst) {
            System.out.println(employee.getId());
            System.out.println(employee.getName());
            System.out.println(employee.getDob());
            System.out.println(employee.getSalary());
        }
    }
}

class Employee implements Comparable<Employee>{

    int empId;
    String name;
    String dob;
    double salary;

    public Employee(int empId ,String name ,String dob ,double salary){
        this.empId=empId;
        this.name=name;
        this.dob=dob;
        this.salary=salary;
    }

    public void setId(int empId){
        this.empId=empId;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public void setDob(String dob){
        this.dob=dob;
    }
    
    public void setSalary(double salary){
        this.salary=salary;
    }

    public int getId(){
        return empId;
    }

    public String getName(){
        return name;
    }

    public String getDob(){
        return dob;
    }

    public double getSalary(){
        return salary;
    }

    public int compareTo(Employee e){
        if(this.salary > e.salary)
            return 1;
        else
            return -1;
    }
}
