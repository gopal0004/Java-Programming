import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word;
        String lines;
        // next() takes only one word
        // nextLine() takes whole sentence
        System.out.println("enter word");
        word = sc.next();
        sc.nextLine();
        System.out.println("enter line");
        lines = sc.nextLine();
        sc.close();

        System.out.println("word : " + word + "line : " + lines);

        // comparing two strings
        System.out.println(word.compareTo(lines));
        // if word == line return 0
        // if word > line return positive value
        // if word < line return negative value

        // printing string by character vice
        for (int i = 0; i < lines.length(); i++) {
            System.out.println("character vice : " + lines.charAt(i));
        }
    }
}
