package Assign1;

// 4. Develop a basic graphics package.
// a. Within the package create a abstract class Shape having function print().
// b. Create two subclasses Two Dimensional and three Dimensional from Shape class .
// c. These two subclasses also should be abstract.
// d. Implement the print method in the subclasses Square, Circle, Cylinder, Cube, to output
// the type and dimension of the shape Also include area and volume methods to calculate
// the area and volume of the concrete shapes
// e. Write a driver program that creates various shapes and put them in an array of Shape
// Use polymorphism to print and calculate the area and volume of objects stored in array.

abstract class Shape {
    public abstract void print();
}

abstract class TwoD extends Shape {
    public abstract double area();
}

abstract class ThreeD extends Shape {
    public abstract double volume();
}

class Square extends TwoD {
    double h;
    double area;

    public Square(double h) {
        this.h = h;
    }

    public double area() {
        return this.area = h * h;
    }

    public void print() {
        System.out.println("The area of the Square is : " + this.area);
    }
}

class Circle extends TwoD {
    double radius;
    double area;
    final double pi = 3.1428;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return this.area = pi * radius * radius;
    }

    public void print() {
        System.out.println("Area of the Circle is : " + this.area);
    }
}

class Cylinder extends ThreeD {
    double radius;
    double height;
    double volume;
    final double pi = 3.1428;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        return this.volume = pi * radius * radius * height;
    }

    public void print() {
        System.out.println("Volume of the Cylinder is : " + this.volume);
    }
}

class Cube extends ThreeD {
    double side;
    double volume;

    public Cube(double side) {
        this.side = side;
    }

    public double volume() {
        return this.volume = side * side * side;
    }

    public void print() {
        System.out.println("The Volume of the Cube is : " + this.volume);
    }
}

public class CI4 {
    public static void main(String[] args) {
        Shape[] s = new Shape[4];

        s[0] = new Square(5);
        s[1] = new Circle(6);
        s[2] = new Cylinder(5, 6);
        s[3] = new Cube(7);

        System.out.println("for each");
        for (Shape s1 : s) {
            if (s1 instanceof TwoD) {
                System.out.println("Area : " + ((TwoD) s1).area());
            } else if (s1 instanceof ThreeD) {
                System.out.println("Volume : " + ((ThreeD) s1).volume());
            }
            s1.print();
        }
    }
}
