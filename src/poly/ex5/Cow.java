package poly.ex5;

public class Cow implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("cow sound");
    }

    @Override
    public void move() {
        System.out.println("cow move");
    }
}
