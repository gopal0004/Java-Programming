public class Hollow_rectangle {

    public static void main(String args[]) {
        // hollow rectangle
        // for row
        for (int i = 1; i <= 4; i++) {
            // for columns
            for (int j = 1; j <= 5; j++) {
                // checking rows and columns where we need to print *
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("*"); // print because at one line we want to print
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
