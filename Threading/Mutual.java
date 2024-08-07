package Threading;

class Table {

    // synchronized method
    // public synchronized void display(int n) {
    // for (int i = 1; i <= 10; i++) {
    // System.out.println(n * i);
    // }
    // }

    public void display(int n) { // 'this' as object that refers to Table t cause 't' is calling display method
        synchronized (this) {
            System.out.println(this.getClass());
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }
        }
    }
}

class Thread1 extends Thread {
    Table t;

    public Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.display(5);
    }
}

class Thread2 extends Thread {
    Table t;

    public Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.display(6);
    }
}

public class Mutual {
    public static void main(String[] args) {
        Table t = new Table();
        Thread1 t1 = new Thread1(t);
        t1.start();
        Thread2 t2 = new Thread2(t);
        t2.start();
    }
}
