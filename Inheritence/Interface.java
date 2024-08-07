package Inheritence;

interface A {

    final static int age = 21; // in interface variable must be final & static
    String name = " "; // it is also static & final by default

    void show(); // by default public abstract is there

    void config();
}

interface X {
    void run();
}

interface Y extends X {
    void tray();
}

class B implements A, Y {
    public void show() {
        System.out.println("In B Show");
    }

    public void config() {
        System.out.println("In Config");
    }

    public void run() {
        System.out.println("running..");
    }

    public void tray() {
        System.out.println("Success");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj; // instantiated A
        obj = new B();
        obj.show();
        obj.config();

        Y obj1 = new B();
        obj1.run();
        obj1.tray();

        System.out.println("by instance of A : " + A.age); // static variable call by class name or interface name
        System.out.println("by instance of A : " + A.name);
    }
}
