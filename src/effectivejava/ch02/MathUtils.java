package effectivejava.ch02;

public final class MathUtils {

    private MathUtils() {
        throw new AssertionError("이 클래스는 유틸리티 클래스이므로 인스턴스화할 수 없습니다.");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {

        int result = MathUtils.sum(10, 20);
        System.out.println("10 + 20 = " + result);

        System.out.println("성공: private 생성자로 인해 new 키워드를 사용한 객체 생성이 차단되었습니다.");
    }
}
