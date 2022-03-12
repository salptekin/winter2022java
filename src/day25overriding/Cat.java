package day25overriding;

public class Cat extends Mammal{

    @Override
    public void feedBabyWithMilk() {
        System.out.println("Cats feed their baby by milk");
    }

    @Override
    public void drink(){
        System.out.println("Cats drink");
    }

    public void meow(){
        System.out.println("Cats meow");
    }
}
