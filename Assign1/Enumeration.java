package DSA;

enum Laptop {
    Macbook(2000), XPS(2200), Surface, Thinkpad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
        System.out.println(this.name());
    }

    private Laptop() { // default constructor because Surface price not given
        price = 500;
        System.out.println("in laptop " + this.name()); // print the name of constructor and object
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enumeration {
    public static void main(String[] args) {
        // Laptop l = Laptop.Macbook;
        // System.out.println(l + " " + l.getPrice());

        for (Laptop lp : Laptop.values()) {
            System.out.println(lp + " " + lp.getPrice());
        }

        Laptop lp[] = Laptop.values();
        System.out.println(lp[0]);
    }
}
