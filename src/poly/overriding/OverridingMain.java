package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("child -> child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println();
        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("parent -> parent");
        System.out.println("value = " + parent.value);
        parent.method();

        System.out.println();
        // 부모변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("parent -> child");
        System.out.println("value = " + poly.value); // 메서드 오버라이딩
        poly.method();

    }
}
