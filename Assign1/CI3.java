package Assign1;

// import java.util.Scanner;Scanner sc=new Scanner();
// Develop the Figure application in given steps.
// a. Design an interface IFig having the following methods:
// i. public void calcAreaQ;
// ii. public void calcVolumeO;
// iii. It must also have the variable pi of the type double and having a value 3.1428.

interface IFig {

    final static double pi = 3.1428;

    public void calcAreaQ();

    public void calcVolumeO();
}

// b. Design an abstract class called Figure.
// i. It must have three attributes r. a and v of data type double.
// ii. It has abstract methods:
// 1. public abstract void disPAreaQ;
// 2. public abstract void disPVolumeO;

abstract class Figure {
    double radius, area, volume;

    public abstract void disPAreaQ();

    public abstract void disPVolumeO();
}

// c. Design three classes Cone, Sphere and Cylinder. Each of them, should
// extend the Figure class and implement the IFig interface.
class Cone extends Figure implements IFig {
    double height, sLHeight;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
        this.sLHeight = Math.sqrt(height * height + radius * radius);
    }

    public void calcAreaQ() {
        this.area = (pi * radius * sLHeight) + (pi * radius * radius);
    }

    public void disPAreaQ() {
        System.out.println("Area is : " + this.area);
    }

    public void calcVolumeO() {
        this.volume = (pi * radius * radius * height) / 3;
    }

    public void disPVolumeO() {
        System.out.println("Volume is : " + this.volume);
    }
}

class Sphere extends Figure implements IFig {
    public Sphere(double radius) {
        this.radius = radius;
    }

    public void calcAreaQ() {
        this.area = 4 * pi * radius * radius;
    }

    public void disPAreaQ() {
        System.out.println("Area of Sphere : " + this.area);
    }

    public void calcVolumeO() {
        this.volume = (4 * pi * radius * radius * radius) / 3;
    }

    public void disPVolumeO() {
        System.out.println("Volume of Sphere : " + this.volume);
    }
}

class Cylinder extends Figure implements IFig {
    double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public void calcAreaQ() {
        this.area = (2 * pi * radius * radius) + (2 * pi * radius * height);
    }

    public void disPAreaQ() {
        System.out.println("Area of the Cylinder : " + this.area);
    }

    public void calcVolumeO() {
        this.volume = pi * radius * radius * height;
    }

    public void disPVolumeO() {
        System.out.println("Volume of the Cylinder : " + this.volume);
    }
}

public class CI3 {
    public static void main(String[] args) {
        Cone c = new Cone(1, 2);
        c.calcAreaQ();
        c.disPAreaQ();
        c.calcVolumeO();
        c.disPAreaQ();

        Sphere s = new Sphere(2);
        s.calcAreaQ();
        s.disPAreaQ();
        s.calcVolumeO();
        s.disPVolumeO();

        Cylinder obj = new Cylinder(1, 2);
        obj.calcAreaQ();
        obj.disPAreaQ();
        obj.calcVolumeO();
        obj.disPVolumeO();
    }
}
