package Threading;

interface X {
    void show();
}

interface Y {
    void show(int i);
}

interface Z {
    int add(int i, int j);
}

public class Lambda {
    public static void main(String[] args) {
        X l = () -> {
            System.out.println("hii");
        };
        l.show();

        Y y = i -> System.out.println("parameter lambda " + i); // lambda expression by passing parameter
        y.show(9);

        // it is also right
        // Z z = (i, j) -> {
        // return i + j;
        // };
        // int sum = z.add(5, 4);
        // System.out.println("sum is : " + sum);

        Z z = (i, j) -> i + j;
        int sum = z.add(3, 2);
        System.out.println("sum is " + sum);

        // Lambda only works with functional interface
    }
}
