import java.util.*;

public class Builder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("enter string");
        str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("main string is : " + sb);
        sc.close();

        // append()
        sb.append(" bera");
        System.out.println("appended str : " + sb);

        // setCharAt()
        sb.setCharAt(0, 'G');
        System.out.println("setCharAt : " + sb);

        // insert()
        sb.insert(0, "my self ");
        System.out.println("insert : " + sb);

        // delete()
        sb.delete(0, 7);
        System.out.println("delete : " + sb);
    }
}
