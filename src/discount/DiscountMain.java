package discount;

import discount.domain.Grade;
import discount.domain.User;
import discount.exception.DiscountException;
import discount.policy.DiscountPolicy;
import discount.service.DiscountService;

public class DiscountMain {

    public static void main(String[] args) {
        User basicUser = new User("basicUser", Grade.BASIC);
        User goldUser = new User("goldUser", Grade.GOLD);

        DiscountService discountService = new DiscountService();

        System.out.println("--- [GOLD 회원 20000원 주문] ---");
        try {
            int goldDiscount = discountService.calculateDiscount(goldUser, 20000);
            System.out.println("GOLD 회원의 할인액: " + goldDiscount + "원");
            System.out.println("리소스 정리 완료");
        } catch (DiscountException e) {
            System.out.println("[오류] 실패: " + e.getMessage());
        }
        System.out.println();

        System.out.println("--- [BASIC 회원 500원 주문] ---");
        try {
            int basicDiscount = discountService.calculateDiscount(basicUser, 500);
            System.out.println("BASIC 회원의 할인액: " + basicDiscount + "원");
            System.out.println("리소스 정리 완료");
        } catch (DiscountException e) {
            System.out.println("[오류] 실패: " + e.getMessage());
        }
        System.out.println();

        System.out.println("--- [BASIC 회원 2000원 주문] ---");
        try {
            int basicDiscount = discountService.calculateDiscount(basicUser, 2000);
            System.out.println("BASIC 회원의 할인액: " + basicDiscount + "원");
            System.out.println("리소스 정리 완료");
        } catch (DiscountException e) {
            System.out.println("[오류] 실패: " + e.getMessage());
        }
        System.out.println();

        System.out.println("--- [여름 이벤트 5000원 주문] ---");
        DiscountPolicy eventPolicy = new DiscountPolicy() {
            @Override
            public int applyDiscount(int price) {
                return 500;
            }
        };
        int eventDiscount = eventPolicy.applyDiscount(5000);
        System.out.println("이벤트 할인액: " + eventDiscount + "원");
    }
}