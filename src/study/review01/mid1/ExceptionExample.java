package study.review01.mid1;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("예외가 발생했습니다: 배열의 인덱스가 범위를 벗어났습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
