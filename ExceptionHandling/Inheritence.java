package ExceptionHandling;

class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvanceCalc extends Calc {
    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class Inheritence {
    public static void main(String[] args) {
        AdvanceCalc obj = new AdvanceCalc();
        obj.div(1, 2);
    }
}
