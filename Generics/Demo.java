package Generics;

public class Demo <T>{

    T Variable;

    public Demo(T Variable){
        this.Variable=Variable;
    }

    public <T> void print(){
        System.out.println(Variable);
    }
}
