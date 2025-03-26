package access.b;

//import access.a.DefaultClass;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
//        DefaultClass defaultClass = new DefaultClass();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
