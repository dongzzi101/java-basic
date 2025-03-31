package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
//        super(); // 기본 생성자 생략 가능
        this(a, 0);
        System.out.println("ClassB constructor a=" + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB constructor a=" + a + ", b=" + b);
    }

    public ClassB(int a, int b, int c) {
        super();
        System.out.println("ClassB 3rd constructor a=" + a + ", b=" + b);
    }
}
