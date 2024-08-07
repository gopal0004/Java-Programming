package Threading;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hii");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e.getStackTrace());
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e.getStackTrace());
            }
        }
    }
}

public class P2 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
        obj2.start();
        // System.out.println("default priority : " + obj1.getPriority());
    }
}
