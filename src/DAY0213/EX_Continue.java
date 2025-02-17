/*
 * 제어문 - continue 문
 *         반복 중단하고 다음 반복으로 진행 시킴
 *         아래쪽 코드 실행되지 않음
 *         while / do ~ while 에서는 무한 반복에 빠질 위험 있음
 *         !! 주의 : continue 전에 값의 증감처리 필수
 */

package src.DAY0213;

public class EX_Continue {
    public static void main(String[] args) {
        // 1 ~ 10 범위에서 2의 배수만 출력하세요

        // for 문과 continue 문
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) continue; // i++로 이동

            System.out.println(i); // (n % 2 == 1) 거짓일 때 실행
        }
        // while 문과 continue 문
        int count = 1;

        while (count <= 10) {
            count++;
            if (count % 2 == 1) continue;

            System.out.println(count);
        }


        // do ~ while 문과 continue 문

        int value = 1;

        do {

            value++;
            if (value % 2 == 1) continue;
            System.out.println(value);

        } while (value <= 10);
    }    
}
