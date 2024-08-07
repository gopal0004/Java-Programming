package Generics;

// import ExceptionHandling.Custom;

public class GenericMethod {
    public static void main(String[] args) {

        printData(01);

        GenericMethod g = new GenericMethod();
        g.showData("Gopal");
        g.showData("Bera");
        // g.<String>showData("Bera"); //in actual it works like , giving explicitly type

        Custom c = new Custom();
        g.showData(c); // passing custom data
    }

    static <T extends Number> void printData(T data){ //<T extends Number> is bounded Generics
        System.out.println(data);
    }

    public <T> void showData(T data){
        System.out.println(data);
    }
}

class Custom <T> {

}
