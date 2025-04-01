package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA interfaceA = new Child();
        interfaceA.methodA();
        interfaceA.methodCommon();
        System.out.println();

        InterfaceB interfaceB = new Child();
        interfaceB.methodB();
        interfaceB.methodCommon();

    }
}
