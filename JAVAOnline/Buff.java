import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buff {
    public static void main(String[] args) throws Exception {
        System.out.println("enter number ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); it
        // is also a way

        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
    }
}
