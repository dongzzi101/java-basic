package poly.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("Cat sound");
    }

    @Override
    public void move() {
        System.out.println("Cow move");
    }
}
