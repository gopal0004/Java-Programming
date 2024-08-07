package Threading;

class Y implements Runnable {

    public Y() {
        new Thread(this).start(); // when we create object of y class the constructor will be called automatically
                                  // and in the constructor 'new' will create object of Thread and in this
                                  // constructor
                                  // we will pass the Y's object and it will create object so we can direct call
                                  // start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

public class Running {
    public static void main(String[] args) {
        Y y = new Y();
        // Thread t1 = new Thread(y); //we have also another way given above
        // t1.start();
    }
}
