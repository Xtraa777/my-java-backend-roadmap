package payment.system;

public class CreditCardStrategy extends AbstractCardPayment {

    private String cardNumber;

    public CreditCardStrategy(String cardIssuer, String cardNumber) {
        super(cardIssuer);
        this.cardNumber = cardNumber;
    }

    @Override
    public void logTransaction() {
        System.out.println("신용카드 거래 기록 (카드번호: " + cardNumber + ")");
    }

    public void applyDiscount() {
        System.out.println("신용카드 프로모션 10% 할인을 적용합니다.");
    }
}