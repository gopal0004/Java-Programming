package PFPack;

import PersonPack.Person;
import FlatPack.Flat;

// c. Package PFPack must contain a class called PFDemo that has a main method .
// i. create objects of the classes Person and Flat and
// ii. invoke the displayOwnershiplnfo() method

public class PFDemo {
    public static void main(String[] args) {
        Person p = new Person(01, "Gopal");
        Flat f = new Flat("C-block", 18, 2);
        p.setFlat(f);
        f.setOwner(p);
        Person.displayOwnershiplnfo(p.PIDNumber, f);
    }
}
