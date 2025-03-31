package poly.basic;

// up casting vs down casting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = (Parent) child; // 업캐스팅은 생략 가능, 생략 권장
        Parent parent2 = child; // 업캐스팅은 생략

        parent.parentMethod();
        parent2.parentMethod();

    }




}
