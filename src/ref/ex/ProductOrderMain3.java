package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int orderCount = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[orderCount];

        for (int i = 1; i <= orderCount; i++) {
            System.out.println(i + "번쨰 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = scanner.next();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            productOrders[i - 1] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }

        return totalPrice;
    }
}
