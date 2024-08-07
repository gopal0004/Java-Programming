package ExceptionHandling;

import java.util.*;

class ex extends Exception {
    String ms = " BSDK";

    @Override
    public String toString() {
        {
            return ms;
        }
    }
}

public class Biswojit {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            if (n < 0) {
                throw new ex();
            }
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        sc.close();
    }
}
