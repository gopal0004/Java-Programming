package ExceptionHandling;

class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        // obj.id=1; //can not access directly
        int a = 001;
        String n = "Gopal";
        obj.setId(a);
        obj.setName(n);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
