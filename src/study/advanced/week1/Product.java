package study.advanced.week1;

public class Product {

    private String productId;
    private String name;
    private double price;
    private int stock;

    public Product(String productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(double price, String name, String productId) {
        this.price = price;
        this.name = name;
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("잘못된 가격입니다.");
        }
    }

    public void setStock(int stock) {
        if (stock > 0) {
            this.stock = stock;
        } else {
            System.out.println("잘못된 수량입니다.");
        }
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            this.stock += quantity;
            System.out.println(quantity + "개를 입고했습니다. 현재 재고: " + stock);
        } else {
            System.out.println("잘못된 수량입니다.");
        }
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            this.stock -= quantity;
            System.out.println(quantity + "개를 판매했습니다. 현재 재고: " + stock);
        } else {
            System.out.println("재고가 부족하거나 유효하지 않은 수량입니다.");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("123", "장난감1", 1000, 2);
        Product product2 = new Product(2000, "장난감2", "1234");

        System.out.println(product1.getPrice());
        System.out.println(product2.getPrice());

        product1.setPrice(2000);
        product2.setPrice(1000);

        System.out.println(product1.getPrice());
        System.out.println(product2.getPrice());

        product2.addStock(2);

        product1.sell(1);
        product2.sell(1);
        product1.sell(2);
        product2.sell(2);
    }

}
