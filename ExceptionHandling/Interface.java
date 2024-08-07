package ExceptionHandling;

abstract class Animal {
    String name;
    String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public abstract void move();
}

interface Feedables { // interface have only abstracts method or final
    public abstract void feed();
}

class Birds extends Animal implements Feedables {
    public Birds(String name, String sound) {
        super(sound, sound);
    }

    @Override
    public void move() {
        System.out.println("birds move");
    }

    @Override
    public void feed() {
        System.out.println("abstract method feed in Birds");
    }
}

public class Interface {
    public static void main(String[] args) throws Exception {
        Birds b = new Birds("crow", "crowwww");
        b.move();
        b.feed();
    }
}
