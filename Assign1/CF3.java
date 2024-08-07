package Assign1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;

// 3. Create a HashTable/ HashMap of students object and find the following:
// a. Check if a particular key exist in the hashtable or not. If exist then display the value
// b. Remove an entry from hashtable (key is entered by user to remove)
// c. Add a new entry
// d. Display all the entries
// e. Check if a particular value exist in the hashtable or not. If exist then display the value

class Student{
    int rollNo;
    String name;

    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public void setR(int rollNo){
        this.rollNo=rollNo;
    }
    public int getR(){
        return rollNo;
    }
    public void setN(String name){
        this.name=name;
    }
    public String getN(){
        return name;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", rno=" + rollNo + "]";
    }
}

public class CF3 {
    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<>();
        Scanner sc =new Scanner(System.in);

        char choice;

        do{
            System.out.println("\nMenu:");
            System.out.println("a. check if a particular key exists and display the value");
            System.out.println("b. Remove entry from hashtable");
            System.out.println("c. Add new entry");
            System.out.println("d. Display all entries");
            System.out.println("e. Check if particular value exists and display the key");
            System.out.println("f. Exit");
            System.out.println("Enter your choice: ");

            choice=sc.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.println("enter key to check exist or not ");
                    int a=sc.nextInt();
                    if(map.containsKey(a)){
                        System.out.println("key exist with value " + map.get(a) );
                    }else{
                        System.out.println("key does not exist");
                    }
                    break;
                case 'b':
                    System.out.println("Enter the roll number to remove: ");
                    int rnr = sc.nextInt();
                    if (map.containsKey(rnr)) {
                        map.remove(rnr);
                        System.out.println("Student with roll number " + rnr + " removed successfully.");
                    } else {
                        System.out.println("No student found with roll number " + rnr + " to remove.");
                    }
                    break;
                case 'c':
                    System.out.println("Enter the name of student: ");
                    String nm = sc.next();
                    System.out.println("Enter the roll number of student: ");
                    int rnn = sc.nextInt();
                    map.put(rnn, new Student(rnn,nm));
                    System.out.println("Student added successfully..");
                    break;
                case 'd':
                    System.out.println("All student entries:");
                    for (Entry<Integer, Student> entry : map.entrySet()) {
                        System.out.println("Roll number: " + entry.getKey() + ",Student Details: " + entry.getValue());
                    }
                    break;
                case 'e':
                    System.out.println("Enter the name of the student to check: ");
                    String nme = sc.next();
                    boolean found = false;
                    for (Student student : map.values()) {
                        if (student.getN().equals(nme)) {
                            System.out.println("Student found with name '" + nme + "': " + student.getR());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No student found with name '" + nme + "'.");
                    }
                    break;
                case 'f':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice != 'f');
    }
}
