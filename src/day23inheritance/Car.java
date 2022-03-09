package day23inheritance;

public class Car extends Motorized{

    public Car(String make){
        super(16);
        System.out.println("Car constructor with String parameter");
    }

    public Car(int price){
        super(20);
        System.out.println("Car constructor with integer parameter");
    }
}
