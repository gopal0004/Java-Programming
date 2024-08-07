package Threading;

// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hii");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException e) {
//                 System.out.println(e.getStackTrace());
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException e) {
//                 System.out.println(e.getStackTrace());
//             }
//         }
//     }
// }

public class Imp {
    public static void main(String[] args) {
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();

        // Thread t1 = new Thread(obj1); // creating object because Thread has method
        // start();
        // Thread t2 = new Thread(obj2); // without passing runnable object it will not
        // able to identify start method
        // // Thread class constructor accepts object of Runnable

        // t1.start();
        // t2.start();

        // By anonymous class object

        // Runnable obj1 = new Runnable() {
        // public void run() {
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hii");
        // try {
        // Thread.sleep(2);
        // } catch (InterruptedException e) {
        // System.out.println(e.getStackTrace());
        // }
        // }
        // }
        // };

        // Runnable obj2 = new Runnable() {
        // public void run() {
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // try {
        // Thread.sleep(2);
        // } catch (InterruptedException e) {
        // System.out.println(e.getStackTrace());
        // }
        // }
        // }
        // };

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();

        // By lambada function
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    System.out.println(e.getStackTrace());
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    System.out.println(e.getStackTrace());
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
