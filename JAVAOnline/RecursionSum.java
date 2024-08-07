public class RecursionSum {
    public static void recursion(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println("sum is : " + sum);
            return;
        }
        sum += i;
        recursion(i + 1, n, sum);
    }

    public static void main(String args[]) {
        recursion(1, 5, 0);// i=start range,n=end range,sum thea we want
    }
}
