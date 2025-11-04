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

        runDiscountTest(discountService, goldUser, 20000, "[GOLD 회원 20000원 주문]");
        System.out.println();
        runDiscountTest(discountService, basicUser, 500, "[BASIC 회원 500원 주문 (예외)]");
        System.out.println();
        runDiscountTest(discountService, basicUser, 2000, "[BASIC 회원 2000원 주문]");
        System.out.println();

        // 익명 클래스 시나리오는 별도로
        System.out.println("--- [여름 이벤트 5000원 주문] ---");
        DiscountPolicy eventPolicy = new DiscountPolicy() {
            @Override
            public int applyDiscount(int price) {
                return 500;
            }
        };
        int eventDiscountAmount = eventPolicy.applyDiscount(5000);
        System.out.println("[이벤트] 익명 클래스 할인액: " + eventDiscountAmount + "원");
    }

    /**
     * @param service 할인 서비스
     * @param user 회원
     * @param price 가격
     * @param testTitle 테스트 시나리오 제목
     */
    private static void runDiscountTest(DiscountService service, User user, int price, String testTitle) {
        System.out.println("--- " + testTitle + " ---");
        try {
            int discountAmount = service.calculateDiscount(user, price);
            System.out.println("[정상] " + user.grade() + " 회원의 할인액: " + discountAmount + "원");
        } catch (DiscountException e) {
            System.out.println("[오류] 실패: " + e.getMessage());
        }
    }
}