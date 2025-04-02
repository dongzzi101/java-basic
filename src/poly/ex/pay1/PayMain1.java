package poly.ex.pay1;

public class PayMain1 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao
        String payOption1 = "kakao";
        int amount = 5000;
        payService.processPay(payOption1, amount);
        System.out.println();

        // naver
        String payOption2 = "naver";
        int amount2 = 5000;
        payService.processPay(payOption2, amount2);
        System.out.println();

        // wrong
        String payOption3 = "bad";
        int amount3 = 5000;
        payService.processPay(payOption3, amount3);
        System.out.println();

        // wrong
        String payOption4 = "new";
        int amount4 = 15000;
        payService.processPay(payOption4, amount4);
        System.out.println();
    }
}
