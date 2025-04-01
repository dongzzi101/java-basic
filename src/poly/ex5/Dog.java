package poly.ex5;

public class Dog implements InterfaceAnimal {


    @Override
    public void sound() {
        System.out.println("dog sound");
    }

    @Override
    public void move() {
        System.out.println("dog move");
    }
}
