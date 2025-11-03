package payment.system;

public class KakaoPayStrategy implements PayStrategy {

    @Override
    public boolean processPayment(int amount) {
        System.out.println("카카오페이로 " + amount + "원 결제를 시도합니다.");
        return true;
    }
}
