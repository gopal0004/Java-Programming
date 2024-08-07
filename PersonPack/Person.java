package PersonPack;

import FlatPack.Flat;

// a. Package PersonPack must contain a class called Person with the following attributes:
// PIDNumber, name, etc.
// i. It must have a reference variable of the type Flat.
// ii. It should have a static method displayOwnershiplnfo() that takes as an input
// parameter a variable of PIDNumber and returns void. This method must display
// the information about the classes Person and Flat.
public class Person {
    public int PIDNumber;
    String name;
    Flat f;

    public Person(int PIDNumber, String name) {
        this.PIDNumber = PIDNumber;
        this.name = name;
    }

    public void setFlat(Flat f) {
        this.f = f;
    }

    public static void displayOwnershiplnfo(int PIDNumber, Flat f) {
        System.out.println("PIDnumber of the Person is : " + PIDNumber);
        System.out.println("Name of the Person is : " + f.getOwner().name);

        f.dispFlatlnfo();
    }
}
