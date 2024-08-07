package Practice;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int size = 100;
        int[] arr = new int[size];

        T1 t1 = new T1(size, arr);
        T2 t2 = new T2();
        T3 t3 = new T3(t2);

        t1.start();
        t2.start();
        t3.start();
    }
}

class T1 extends Thread {

    int size;
    int arr[];

    public T1(int size, int arr[]) {
        this.size = size;
        this.arr = new int[size];
    }

    public void run() {
        int count = 0;
        int num = 2;

        synchronized (this.arr){
            while (count < size) {
                boolean prime = true;
                if (num <= 1) {
                    prime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                }
    
                if (prime) {
                    arr[count] = num;
                    count++;
                }
                num++;
            }
            System.out.println("Primes number are");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

class T2 extends T1 {

    public void run() {
        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 13) {
                    try {
                        System.out.println(getName() + "goes into wait mode");
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (arr[i] == 79) {
                    System.out.println(getName() + "resumed");
                }
            }
        }
    }
}

class T3 extends T1 {

    T2 t2;

    public T3(T2 t2) {
        this.t2 = t2;
    }

    public void run() {
        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 79) {
                    System.out.println(getName() + " notifies T2");
                    t2.notify();
                } else {
                    continue;
                }
            }
        }
    }
}