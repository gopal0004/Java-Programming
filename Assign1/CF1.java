package Assign1;

import java.util.Collections;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.List;

// 1. Write a program to read employee detail and store the employee object in linkedList. Sort the
// list based on salary.
// a. Create class- Employee (Attributes- empId, name , dob , salary : Methods: setDetails,
// getDetails and contractures ()
// b. Employee class must implement comparable interface
// c. Create another class TestEmployee, here create the linkedList of employees and sort the
// list.

class Employee implements Comparable<Employee> {
    Scanner sc = new Scanner(System.in);
    int empId;
    String name;
    String dob;
    double salary;

    public Employee(int empId, String name, String dob, double salary) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public void setId(int empId) {
        this.empId = empId;
    }

    public int getId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public String getDOB() {
        return dob;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee e) {
        if (this.salary < e.salary)
            return -1;
        if (this.salary > e.salary)
            return 1;
        else
            return 0;
    }

}

public class CF1 {
    public static void main(String[] args) {
        List<Employee> emp = new LinkedList<>();
        Employee e1 = new Employee(001, "Gopal", "01/03/2003", 50000);
        Employee e2 = new Employee(002, "Rohit Sharma", "30/04/1987", 100000);
        Employee e3 = new Employee(003, "Shikhar Dhavan", "05/12/1985", 150000);
        Employee e4 = new Employee(004, "Hardik Pandya", "11/10/1993", 10);
        Employee e5 = new Employee(005, "Virat Kohli", "5/11/1988", 45000);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);

        Collections.sort(emp);

        for (Employee e : emp) {
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getDOB());
            System.out.println(e.getSalary());
        }

    }
}
