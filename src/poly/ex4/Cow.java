package poly.ex4;

public class Cow extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Cow sound");
    }

    @Override
    public void move() {
        System.out.println("Cow move");
    }
}
