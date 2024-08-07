package Assign1;

import java.util.Scanner;

class Cartesian {
    private double x;
    private double y;

    public Cartesian(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Cartesian(double x) {
        this.x = x;
        this.y = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double x, double y) {
        this.x = y;
        this.y = x;
        // System.out.println(this.x);
        // System.out.println(this.y);
    }

    public void display() {
        System.out.println(this.x);
        System.out.println(this.y);
    }

    public void move(double x) {
        this.x = x;
        this.y = x;
    }
}

class Triangle {
    Cartesian c1;
    Cartesian c2;
    Cartesian c3;
    double side1, side2, side3;

    public Triangle(Cartesian c1, Cartesian c2, Cartesian c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        this.side1 = Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(), 2));
        this.side2 = Math.sqrt(Math.pow(c3.getX() - c2.getX(), 2) + Math.pow(c3.getY() - c2.getY(), 2));
        this.side3 = Math.sqrt(Math.pow(c1.getX() - c3.getX(), 2) + Math.pow(c1.getY() - c3.getY(), 2));

    }

    public void area() {
        double s_perimeter = (side1 + side2 + side3) / 2;
        System.out.println("perimeter is : " + s_perimeter);
        double area = Math.sqrt(s_perimeter * (s_perimeter - side1) * (s_perimeter - side2) * (s_perimeter - side3));
        System.out.println("Area is : " + area);
    }

    public double parameter() {
        return side1 + side2 + side3;
    }

    public void display() {
        c1.display();
        c2.display();
        c3.display();
    }

    public void move(Cartesian c) {
        double x_diff = c.getX() - c1.getX();
        double y_diff = c.getY() - c1.getY();

        c1.move(c.getX(), c.getY());
        c2.move(x_diff + c2.getX(), y_diff + c2.getY());
        c3.move(x_diff + c3.getX(), y_diff + c3.getY());

        System.out.println("Difference : " + x_diff + " and " + y_diff);
    }

    public void move(double x, double y) {
        double x_diff = x - c1.getX();
        double y_diff = y - c1.getY();
        c1.move(x, y);
        c2.move(x_diff + c2.getX(), y_diff + c2.getY());
        c3.move(x_diff + c3.getX(), y_diff + c3.getY());
    }

    public void rotate(double angle) {
        c1.move(c1.getX() * Math.cos(angle) - c1.getY() * Math.sin(angle),
                c1.getX() * Math.sin(angle) + c1.getY() * Math.cos(angle));

        c2.move(c2.getX() * Math.cos(angle) - c2.getY() * Math.sin(angle),
                c2.getX() * Math.sin(angle) + c2.getY() * Math.cos(angle));

        c3.move(c3.getX() * Math.cos(angle) - c3.getY() * Math.sin(angle),
                c3.getX() * Math.sin(angle) + c3.getY() * Math.cos(angle));
    }

}

public class CI2 {
    public static void main(String[] args) {
        Cartesian p1 = new Cartesian(20, 30);
        Cartesian p2 = new Cartesian(12, 40);
        Cartesian p3 = new Cartesian(13, 50);
        Triangle t1 = new Triangle(p1, p2, p3);
        t1.display();
        t1.move(3, 4);
        t1.display();
        t1.area();
        t1.rotate(180);
        t1.display();
        t1.area();
    }
}
