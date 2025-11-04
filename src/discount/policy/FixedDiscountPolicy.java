package discount.policy;

public class FixedDiscountPolicy implements DiscountPolicy{

    private final int discountAmount;

    public FixedDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int applyDiscount(int price) {
        return discountAmount;
    }
}