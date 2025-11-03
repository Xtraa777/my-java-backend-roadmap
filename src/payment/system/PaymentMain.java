package payment.system;

public class PaymentMain {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        // 시나리오 1: 카카오페이 결제
        System.out.println("--- 카카오페이 결제 ---");
        paymentService.setPayStrategy(new KakaoPayStrategy());
        paymentService.checkout(5000);

        // 시나리오 2: 네이버페이 결제
        System.out.println("--- 네이버페이 결제 ---");
        paymentService.setPayStrategy(new NaverPayStrategy());
        paymentService.checkout(10000);

        // 시나리오 3: 신용카드 결제
        System.out.println("--- 신용카드 결제 ---");
        paymentService.setPayStrategy(new CreditCardStrategy("KB국민카드", "1234-xxxx-xxxx-5678"));
        paymentService.checkout(20000);
    }
}
