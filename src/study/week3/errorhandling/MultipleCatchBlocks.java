package study.week3.errorhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("나눠질 숫자(정수)를 입력하세요: ");
            int num1 = scanner.nextInt(); // 여기서 문자 등 입력 시 InputMismatchException 발생 가능

            System.out.print("나눌 숫자(정수)를 입력하세요: ");
            int num2 = scanner.nextInt(); // 여기서도 InputMismatchException 발생 가능

            System.out.println("나눗셈을 시도합니다...");
            int result = num1 / num2; // num2가 0이면 ArithmeticException 발생 가능

            System.out.println("결과: " + num1 + " / " + num2 + " = " + result);

        } catch (InputMismatchException e) {
            System.out.println("[입력 오류] 정수만 입력해야 합니다!");

        } catch (ArithmeticException e) {
            System.out.println("[계산 오류] 0으로 나눌 수 없습니다!");

        } catch (Exception e) {
            // 위 catch 블록들에서 잡지 못한 다른 모든 종류의 예외를 대비한 포괄적 처리
            // Exception은 모든 예외의 최상위 부모 클래스 중 하나입니다.
            // 이 catch 블록은 항상 다른 특정 예외 catch 블록들보다 뒤에 위치해야 합니다
            System.out.println("[알 수 없는 오류] 오류가 발생했습니다: " + e.getMessage());
        }

        System.out.println("스캐너를 닫고 프로그램을 계속 진행합니다.");
        scanner.close(); // 자원 해제 (finally에서 하는 것이 더 일반적)
    }
}
