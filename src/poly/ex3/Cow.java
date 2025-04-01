package poly.ex3;

import poly.ex2.Animal;

public class Cow  extends AbstractAnimal{

    public Cow() {
        System.out.println("Cow constructor");
    }

    @Override
    public void sound() {
        System.out.println("Cow sound");
    }
}
