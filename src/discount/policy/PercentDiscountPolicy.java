package discount.policy;

public class PercentDiscountPolicy implements DiscountPolicy {

    private final int discountPercent;

    public PercentDiscountPolicy(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public int applyDiscount(int price) {
        return price * discountPercent / 100;
    }
}
