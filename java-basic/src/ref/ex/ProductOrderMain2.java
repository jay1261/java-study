package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[num];

        for (int i = 0; i < num; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        System.out.println("totalAmount : " + getTotalAmount(productOrders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders){
        for (ProductOrder order: productOrders){
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for(ProductOrder order: productOrders){
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }
}
