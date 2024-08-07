package Practice;

public class Q2 {
    public static void main(String[] args) {
        
        Shared s = new Shared();
        Customer c = new Customer(s);
        Manager m = new Manager(s);

        c.start();
        m.start();
    }
}

class Shared {

    int order;
    boolean flag = true;

    public synchronized void produce(int order){
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        this.order = order;
        System.out.println("Order : " + order);
        flag=false;
        notify();
    }

    public synchronized int consume(){
        while (flag) {
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        flag = true;
        notify();
        return order;
    }

}

class Customer extends Thread{

    Shared s = new Shared();
    public Customer(Shared s){
        this.s=s;
    }
    public void run(){
        for(int i=0;i<5;i++){
            s.produce(i+1);
            try {
                sleep(250);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Manager extends Thread{

    Shared s = new Shared();
    public Manager(Shared s){
        this.s=s;
    }

    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("consumed order : " + s.consume());
            try {
                sleep(250);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
