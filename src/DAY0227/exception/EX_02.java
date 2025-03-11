package src.DAY0227.exception;

import java.util.Scanner;
/*
 * JAVA EXCEPTION HANDLING
 * - 심각성이 약한 실행 시 발생하는 에러
 * - 프로그램 중단 안 되도록 처리해주는 것
 */

public class EX_02 {
    public static void main(String[] args) {
        try {
        // 사용자에게 입력 받은 데이터를 배열에 저장하기
        // 입력 인스턴스 생성
        Scanner scanner = new Scanner(System.in);

        // 입력 데이터를 저장할 배열
        int numsArr[] = new int[5];
        int idx = 0;

        
        // 입력 받은 숫자 중 짝수만 배열에 저장하기
        while(idx <= 5)
            {
                System.out.print("정수 숫자 1개 입력 : ");
                int num1 = scanner.nextInt();

                if (num1 % 2 == 0) {
                    numsArr[idx] = num1;
                    idx++;
                }
            }
    
    
        // 입력 스트림 중단
        scanner.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예기치 못한 내부적인 문제가 발생했습니다.");
        } finally {
            System.out.println("END");
        }
    }
}
