package Practice;


public class Q1 {
    public static void main(String[] args) {
        int[] dca1={81,82,83};
        Student s1 = new DcaStudent("dca01", "Gopal", dca1);
        s1.countGrade(dca1);
        s1.displayGrade();
        s1.display();
    }
}

interface Grade {
    int countGrade(int[] marks);
    void displayGrade();
}

abstract class Student implements Grade{
    String id;
    String name;

    public Student(String id ,String name){
        this.id=id;
        this.name=name;
    }
    public abstract void display();

}

class McaStudent extends Student{
    int sem1,sem2,sem3,sem4,sem5,sem6;
    int total;
    String grade;

    int marks[] = {sem1,sem2,sem3,sem4,sem5,sem6};
    
    public McaStudent(String id,String name,int marks[]){
        super(id, name);
        this.marks=marks;
    }

    public int countGrade(int[] marks){
        int n=marks.length;
        
        for(int i=0;i<n;i++){
            total+=marks[i];
        }
        
        return total;
    }

    public void displayGrade(){
        double percentage = total / marks.length;

        if(percentage > 80) {
            System.out.println("A");
        }else if (percentage > 70 & percentage < 80) {
            System.out.println("B");
        } else if (percentage >50 & percentage < 70) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }

    public void display(){
        System.out.println("Details about MCA students");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        for (int i=0;i<marks.length;i++){
            System.out.println("marks for sem " + (i+1) + " is :" + marks[i]);
        }
    }
}

class DcaStudent extends Student{
    int dca1,dca2,project;
    int marks_dca[] ={dca1,dca2,project};

    public DcaStudent(String id,String name ,int marks_dca[]){
        super(id, name);
        this.marks_dca=marks_dca;
    }
    int sum;
    double percentages;

    public int countGrade(int[] marks_dca){
        int n=marks_dca.length;
        for(int i=0;i<n;i++){
            sum+=marks_dca[i];
        }
        return sum;
    }

    public void displayGrade(){
        double percentage = sum / marks_dca.length;

        if(percentage > 75){
            System.out.println("A");
        }else if (percentage > 60 & percentage <=75) {
            System.out.println("B");
        } else if (percentage >50 & percentage <= 60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }

    public void display(){
        System.out.println("Details about DCA students");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        for(int i=0;i<marks_dca.length;i++){
            System.out.println("marks for sem " + (i+1) + " is :" + marks_dca[i]);
        }
        System.out.println("Total marks : " + sum);
    }
}
