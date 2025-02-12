/*
 * 제어문 - 반복문 for문
 * for (반복시작; 반복중단조건; 증감)
 * {
 *      반복 코드;
 * }
 */

package src.DAY0212;

public class EX_FOR_01 {
    public static void main(String[] args) {
        // 1 ~ 10까지 화면 출력
        //        (1)        (2)      (4)
        for (int idx = 0; idx < 11; idx++) {
            // (3) 반복코드
            System.out.println(idx);
        }

        int cnt = 0;

        for(cnt = 100; cnt < 111; cnt++) {
            System.out.println(cnt);
        }
    }
    
}
