package poly.ex.pay0;

public class PayMain0 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao
        String payOption1 = "kakao";
        int amount = 5000;
        payService.processPay(payOption1, amount);

        // naver
        String payOption2 = "naver";
        int amount2 = 5000;
        payService.processPay(payOption2, amount2);

        // wrong
        String payOption3 = "bad";
        int amount3 = 5000;
        payService.processPay(payOption3, amount3);

    }
}
