package poly.ex3;

public abstract class AbstractAnimal {

    public AbstractAnimal() {
        System.out.println("abstractAnimal constructor");
    }

    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
