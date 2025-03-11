package src.DAY0227.exception;

import java.util.Scanner;
/*
 * JAVA EXCEPTION HANDLING
 * - 심각성이 약한 실행 시 발생하는 에러
 * - 프로그램 중단 안 되도록 처리해주는 것
 */

public class EX_03 {
    public static void main(String[] args) {
        // 입력 인스턴스 생성
        Scanner scanner = new Scanner(System.in);
        try {
        // 사용자에게 입력 받은 데이터를 배열에 저장하기


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
    
        } catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
            System.out.println("[ArithmeticException] 수학 관련 예외 발생 처리.");
        
        } catch(ArrayIndexOutOfBoundsException ie) {
            System.out.println("[ArrayIndexOutOfBoundsException] 배열 관련 예외 발생 처리.");

        } catch(Exception e) {
            System.out.println("[Exception] 모든 예외 발생 처리.");
        
        } finally {
            System.out.println("END");
            
            // 입력 스트림 중단
            scanner.close();    
        }
    }
}
