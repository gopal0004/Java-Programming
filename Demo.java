
class A extends Thread {

    // @Override
    public void run() {
        Thread th = Thread.currentThread();
        String name = th.getName();

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + name);
            try {
                sleep(5);
            } catch (InterruptedException e) {
                System.out.println("emm" + e);
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Thread th = Thread.currentThread();
        String name = th.getName();
        a.start();
        a.join();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}