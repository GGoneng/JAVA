package src.DAY0227.exception;

import java.util.Scanner;
/*
 * JAVA EXCEPTION HANDLING
 * - 심각성이 약한 실행 시 발생하는 에러
 * - 프로그램 중단 안 되도록 처리해주는 것
 */

public class EX_01 {
    public static void main(String[] args) {
        try {
        // 사용자에게 숫자를 입력 받아서 나눗셈 처리
        // 입력 인스턴스 생성
        Scanner scanner = new Scanner(System.in);

        // 숫자 2개 입력 받아서 나눗셈 결과를 화면에 출력
        System.out.print("정수 숫자 2개 입력 (EX: 10 5) : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("%d / %d = %f%n", num1, num2, (float)num1 / num2);

        // 입력 스트림 중단
        scanner.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("적합한 데이터가 아니어서 계산이 불가합니다.");
        }

        System.out.println("END");
    }
}
