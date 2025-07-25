package study.review01.basic;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = new ProductOrder("두부", 2000, 2);
        productOrders[1] = new ProductOrder("김치", 5000, 1);
        productOrders[2] = new ProductOrder("콜라", 1500, 2);

        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            totalAmount += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }

}

    class ProductOrder {

    String productName;
    int price;
    int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}
