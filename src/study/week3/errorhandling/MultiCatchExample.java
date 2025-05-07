package study.week3.errorhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("숫자를 입력하세요: ");
            int number = scanner.nextInt();

            System.out.print("나눌 숫자를 입력하세요: ");
            int divisor = scanner.nextInt();

            int result = number / divisor;
            System.out.println("결과: " + result);

        } catch (InputMismatchException | ArithmeticException e) {
            // InputMismatchException 또는 ArithmeticException 둘 중 하나라도 발생하면 이 블록 실행
            System.out.println("[입력 또는 계산 오류] 문제가 발생했습니다.");
            System.out.println("올바른 정수를 입력했는지, 0으로 나누려 하지 않았는지 확인하세요.");
            // 참고: multi-catch 블록 내의 예외 변수 e는 자동으로 final 취급
            // e = new InputMismatchException(); // 이런 식으로 재할당 불가
            System.out.println("오류 종류: " + e.getClass().getSimpleName()); // 어떤 예외였는지 확인 가능

        } catch (Exception e) { // 그 외 다른 예외 처리
            System.out.println("[알 수 없는 오류] " + e.getMessage());
        }

        System.out.println("스캐너를 닫고 프로그램을 계속 진행합니다.");
        scanner.close();
    }
}
