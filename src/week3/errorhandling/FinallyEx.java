package week3.errorhandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FinallyEx {

    public static void main(String[] args) {

        FileInputStream fis = null;
        Scanner scanner = null;

        try {
            System.out.println("파일 열기를 시도합니다...");
            // fis = new FileInputStream("my_file.txt"); // 파일이 있다고 가정
            fis = new FileInputStream("non_existent_file.txt"); // 파일이 없다고 가정 (예외 발생 유도)
            scanner = new Scanner(fis); // fis로부터 데이터를 읽는 Scanner 생성

            System.out.println("파일 내용:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("-- 파일 읽기 완료 --");

        } catch (IOException e) { // FileNotFoundException 포함한 입출력 예외 처리
            System.out.println("[오류] 파일 처리 중 예외 발생: " + e.getMessage());

        } finally {
            // --- 예외 발생 여부와 관계없이 항상 실행 ---
            System.out.println("--- finally 블록 시작 ---");
            // 사용한 자원(Scanner, FileInputStream)을 닫아줌 (해제)
            // 자원이 정상적으로 열렸을 경우(null이 아닐 경우)에만 close() 호출
            if (scanner != null) {
                System.out.println("Scanner를 닫습니다.");
                scanner.close();
            }
            if (fis != null) {
                System.out.println("FileInputStream을 닫습니다.");
                try {
                    fis.close(); // close() 메서드 자체도 IOException 발생 가능성이 있음
                } catch (IOException e) {
                    System.out.println("FileInputStream 닫기 중 오류: " + e.getMessage());
                }
            }
            System.out.println("--- finally 블록 끝 ---");
        }

        System.out.println("프로그램이 계속됩니다...");
    }
}
