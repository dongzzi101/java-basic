package poly.ex5;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("cat sound");
    }

    @Override
    public void move() {
        System.out.println("cat move");
    }
}
