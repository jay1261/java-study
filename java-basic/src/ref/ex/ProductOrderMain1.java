package ref.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1]  = createOrder("김치", 5000, 1);
        productOrders[2]  = createOrder("콜라", 1500, 2);

        printOrders(productOrders);
        System.out.println("totalAmount : " + getTotalAmount(productOrders));
    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
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
