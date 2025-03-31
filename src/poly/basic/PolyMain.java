package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();
        System.out.println();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("child -> child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        System.out.println();

        // 부모 변수가 자식 인스턴스 참조
        System.out.println("parent -> child");
        Parent poly = new Child();
        poly.parentMethod();

    }

}
