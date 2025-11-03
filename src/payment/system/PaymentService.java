package payment.system;

public class PaymentService {

    private PayStrategy payStrategy;

    public PaymentService() {
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void checkout(int amount) {
        boolean flag = payStrategy.processPayment(amount);

        if (flag) {
            System.out.println("결제가 성공적으로 완료되었습니다.");
            if (payStrategy instanceof CreditCardStrategy) {
                ((CreditCardStrategy) payStrategy).applyDiscount();
            }
        } else {
            System.out.println("결제가 실패되었습니다.");
        }
    }
}