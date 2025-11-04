package discount.service;

import discount.domain.Grade;
import discount.domain.User;
import discount.exception.DiscountException;
import discount.policy.*;
import discount.resource.MockResource;

public class DiscountService {

    public DiscountPolicy getPolicy(User user) {
        return switch (user.grade()) {
            case Grade.BASIC -> new FixedDiscountPolicy(1000);
            case Grade.GOLD -> new PercentDiscountPolicy(10);
        };
    }

    public int calculateDiscount(User user, int price) throws DiscountException {
        try (MockResource resource = new MockResource()) {
            if (price < 1000) {
                throw new DiscountException("1000원 미만 상품은 할인 적용이 불가능합니다.");
            }
            return getPolicy(user).applyDiscount(price);
        } catch (DiscountException de) {
            throw de;
        } catch (Exception e) {
            throw new RuntimeException("리소스 정리 중 예기치 않은 오류 발생", e);
        }
    }
}