package Threading;

class Table1 extends Thread {

    // as static method with synchronized
    // public synchronized static void display(int n) {
    // for (int i = 1; i < 10; i++) {
    // System.out.println(n * i);
    // }
    // }

    // synchronized static block
    public static void display(int n) {
        synchronized (Table1.class) // static only accessed by class name so we have to give Table.class
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }
        }
    }

}

class Thread1 extends Thread {
    public void run() {
        Table1.display(5);
    }
}

class Thread2 extends Thread {
    public void run() {
        Table1.display(6);
    }
}

public class Synchro {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
}
