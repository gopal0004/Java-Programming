package Generics;

public class Dog {
    public static void main(String[] args) {
        
        DogDetail<Integer,String,Double> d1 = new DogDetail<>(01, "German",50000.00);
        System.out.println(d1.getId());
        System.out.println(d1.getName());
        System.out.println(d1.getPrice());
    }
}

class DogDetail <T,E,V>{
    
    T id;
    E name;
    V price;

    public DogDetail(T id , E name,V price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    T getId(){
        return id;
    }

    E getName(){
        return name;
    }

    V getPrice(){
        return price;
    }
}
