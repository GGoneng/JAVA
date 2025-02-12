/*
 * 키보드 입력 받아서 조건에 해당 여부 결과 출력
 * - Scanner 인스턴스 생성 : 표준 입력, System.in 스트림림
 */

package src.DAY0212;

import java.util.Scanner;

public class EX_TEST01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("문자를 입력해주세요 : \n");
        
        String input = scan.next();
        char cdata = input.charAt(0);
        // [1] 입력 받은 문자가 알파벳 대문자 여부
        System.out.printf("A <= %c <= Z : %b \n", cdata, ('A' <= cdata) && ('Z' >= cdata));

        // [2] 입력 받은 문자가 짝수인지 여부
        int num = scan.nextInt();
        System.out.printf("%d %% 2 == 0 : %b \n", num, (num % 2 == 0));

        // [3] 입력 받은 문자가 숫자(0 ~ 9) 여부
        cdata = scan.next().charAt(0);
        System.out.printf("0 <= %c <= 9 : %b \n", cdata, ('0' <= cdata) && ('9' >= cdata));

        scan.close();
    }
}
