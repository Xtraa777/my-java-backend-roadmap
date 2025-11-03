package study.advanced.week3.errorhandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcesEx {
    public static void main(String[] args) {
        System.out.println("--- try-with-resources 시작 ---");

        // try(...) 괄호 안에 자원(AutoCloseable 구현 객체) 생성 코드를 넣는다.
        try (FileInputStream fis = new FileInputStream("non_existent_file.txt"); // 자원 1 선언 및 생성
             Scanner scanner = new Scanner(fis)) { // 자원 2 선언 및 생성

            // --- try 블록: 자원을 사용하는 코드 ---
            System.out.println("파일 내용:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("-- 파일 읽기 완료 --");

        } catch (IOException e) { // 예외 처리는 여전히 필요
            System.out.println("[오류] 파일 처리 중 예외 발생: " + e.getMessage());
        }
        // finally 블록이 없어도, try 블록을 벗어나면
        // 자동으로 scanner.close() 와 fis.close() 가 호출됩니다!

        System.out.println("--- try-with-resources 끝 ---");
        System.out.println("프로그램이 계속됩니다...");
    }
}
