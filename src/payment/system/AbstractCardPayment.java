package payment.system;

public abstract class AbstractCardPayment implements PayStrategy {

    protected String cardIssuer;

    public AbstractCardPayment(String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public abstract void logTransaction();

    @Override
    public boolean processPayment(int amount) {
        System.out.println(this.cardIssuer + " 카드로 " + amount + "원 결제를 시도합니다.");
        logTransaction();
        return true;
    }

    @Override
    public void performPostAction() {
    }
}
