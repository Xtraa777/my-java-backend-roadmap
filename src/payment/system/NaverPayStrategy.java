package payment.system;

public class NaverPayStrategy implements PayStrategy {

    @Override
    public boolean processPayment(int amount) {
        System.out.println("네이버페이로 " + amount + "원 결제를 시도합니다.");
        return true;
    }

    @Override
    public void performPostAction() {
    }
}
