package Threading;

class X extends Thread {
    public void run() {
        try {
            this.join(); // dead lock will occur because the function pause itself to done execution
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + this.currentThread().getName());
        }
    }
}

public class DeadLock {
    public static void main(String[] args) throws Exception {
        X x = new X();
        x.start();
        x.join();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread());
        }
    }
}
