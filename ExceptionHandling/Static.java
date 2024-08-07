package ExceptionHandling;

class Mobile {
    String brand;
    int price;
    static String name;

    // constructor
    public Mobile() {
        brand = "";
        price = 0;
        System.out.println("constructor called");
        // we can also initialize static variable in constructor
    }

    // static block
    static {
        name = "SmartPhone"; // it doesn't affect how many object you create of this class,
        System.out.println("static block"); // but value of static variable will remain same
    }

    public void show() { // in normal method we can use static variable
        System.out.println("Brand : " + brand + "  price: " + price + "  name : " + name);
    }
    // public static void show(Mobile obj){ // to initialize non static variable we
    // have to pass object
    // System.out.println("Brand : "+brand+" price: "+price+" name : "+name);
    // }

}

public class Static {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.price = 100000;
        obj1.brand = "Apple";
        // Mobile.name = "Samsung";// to access static variable
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.price = 16500;
        obj2.brand = "vivo";
        obj2.show();

        // Class.forName("Mobile"); // but also we have to use throws Exception
    }
}
