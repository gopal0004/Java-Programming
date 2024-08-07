package DSA;

class A {
    void show() {
        System.out.println("in class A");
    }
}

class B extends A {
    void show2() {
        System.out.println("in class B");
    }
}

public class Demo {
    public static void main(String[] args) {
        // it is implicitly available when we write A obj=new A();
        A obj = (A) new B(); // up casting of object means point to parents class
        obj.show(); // no matter whose reference you are taking but it will point class A

        try {
            B obj1 = (B) new A();
            obj1.show2();
        } catch (ClassCastException e) {
            System.out.println("invalid casting " + e);
        }
    }
}
