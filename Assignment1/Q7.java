package Assignment1;

public class Q7 {
    public static void main(String[] args) {
        // int n = 0;
        double sum = 0;
        // double random = Math.random();
        while (sum <= 20) {
            System.out.println(Math.random() * 2);
            sum += Math.random();
            if (sum >= 20)
                break;
        }
        System.out.println("sum : " + sum);
    }
}
