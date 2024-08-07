package FlatPack;

// b. Package FlatPack must contain the class F with following attributes: apartmentName,
// flatNo and noOfBedrooms
// i. It should have method displayFlat information() that displays information of the attributes
// of the class Flat.
import PersonPack.Person;

public class Flat {
    String apartmentName;
    int flatNo;
    int noOfBedrooms;
    Person owner;

    public Flat(String apartmentName, int flatNo, int noOfBedrooms) {
        this.apartmentName = apartmentName;
        this.flatNo = flatNo;
        this.noOfBedrooms = noOfBedrooms;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public void dispFlatlnfo() {
        System.out.println("apartmentName is : " + apartmentName);
        System.out.println("flat no. is : " + flatNo);
        System.out.println("noOfBedrooms is : " + noOfBedrooms);

    }
}
