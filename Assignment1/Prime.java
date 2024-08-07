package Assignment1;

// 3) Write an application that generates the first 15 numbers in the Fibonacci series and first 15 prime numbers.
public class Prime {
    public static void main(String[] args) {
        int j = 0;
        int count = 2;

        while (j < 15) {
            boolean is_prime = true;
            for (int i = 2; i < count; i++) {
                if ((count % i) == 0) {
                    is_prime = false;
                }
            }
            if (is_prime) {
                System.out.print(count + " ");
                j++;
            }
            count++;
        }

        System.out.println("fibo");
        int pre = 0;
        int cur = 1;
        System.out.println(pre);
        System.out.println(cur);
        for (int i = 1; i <= 15; i++) {
            int nex = pre + cur;
            System.out.println(nex + " ");
            pre = cur;
            cur = nex;
        }
    }
}
