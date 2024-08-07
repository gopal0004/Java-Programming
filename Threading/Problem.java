package Threading;

class SharedData {
    private int data;
    private boolean writable = true;

    public synchronized void produce(int data) {

        while (writable == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        this.data = data;
        System.out.println("produced : " + data);
        writable = false;
        notify(); // to awake the wait(),but still we have problem like writable still true so
                  // consume can go again in wait
                  // so writable=false;
    }

    public synchronized int consume() {
        while (writable == true) { // if producer doesn't produce value then how can it consume so wait();
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        writable = true;
        notify();
        return data;
    }
}

class Producer extends Thread {
    SharedData d = new SharedData();

    public Producer(SharedData d) {
        this.d = d;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            d.produce(i);
            try {
                sleep(250);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    SharedData d = new SharedData();

    public Consumer(SharedData d) {
        this.d = d;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("consumed value is : " + d.consume());
            try {
                sleep(250);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Problem {
    public static void main(String[] args) {
        SharedData d = new SharedData();

        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
