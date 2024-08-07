package Threading;

class B {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class P3 {
    public static void main(String args[]) throws Exception {
        B b = new B();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                b.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                b.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println(b.count);
    }
}
