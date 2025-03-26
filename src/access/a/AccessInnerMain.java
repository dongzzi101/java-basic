package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출불가
//        data.privateField = 3;
//        data.privateMethod();

        // inner
        data.innerAccess();

    }

}
