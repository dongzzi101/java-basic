package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println("constructInit1 = " + constructInit1.value);
        System.out.println("constructInit2 = " + constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1 = " + fieldInit1.value);
        System.out.println("fieldInit2 = " + fieldInit2.value);
        System.out.println("fieldInit3 = " + fieldInit3.value);


        // 상수 접근
        System.out.println("상수 접근");
        System.out.println("FieldInit.CONST_VALUE = " + FieldInit.CONST_VALUE);
    }




}
