package Generics;

public class Demo1 {
    
    public static void main(String[] args) {
        Demo<Integer> d = new Demo<Integer>(15);
        Demo<String> d1 = new Demo<String>("Gopal");
        Demo<Double> d2 = new Demo<Double>(68.00);

        d.print();
        d1.print();
        d2.print();
    }
}
