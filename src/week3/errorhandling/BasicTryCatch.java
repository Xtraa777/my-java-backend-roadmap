package week3.errorhandling;

public class BasicTryCatch {

    public static void main(String[] args) {

        System.out.println("프로그램 시작!");

        try {
            int[] numbers = {10, 20, 30};
            System.out.println("배열의 첫 번째 요소: " + numbers[0]); // 정상 실행

            System.out.println("배열의 네 번째 요소에 접근 시도...");
            // 아래 라인에서 예외 발생 예상! (인덱스 3은 없음)
            int fourthNumber = numbers[3];

            // 만약 위에서 예외가 발생하면, 아래 라인은 실행되지 않음!
            System.out.println("배열의 네 번째 요소: " + fourthNumber);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("앗! 예외를 잡았습니다!");
            System.out.println("오류: 배열의 인덱스 범위를 벗어났습니다.");

            // System.out.println("예외 메시지: " + e.getMessage()); // 예: Index 3 out of bounds for length 3
            // e.printStackTrace(); // 개발/디버깅 시 오류 추적에 매우 유용 (어디서 예외가 발생했는지 상세히 보여줌)
        }

        System.out.println("try-catch 블록 통과!");
        System.out.println("프로그램 정상 종료!");
    }
}
