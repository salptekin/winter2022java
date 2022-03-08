package day22Inheritance;

public class Dog extends Mammals{ //The class name before the "extends" keyword is the child class
                                 //The class name after the "extends" keyword is the parent class

    public void bark(){
        System.out.println("Dogs bark...");
    }

    public Dog(){
        System.out.println("Dog constructor");
    }

}
