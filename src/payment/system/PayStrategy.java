package payment.system;

public interface PayStrategy {

    boolean processPayment(int amount);

    void performPostAction();
}
