/*
 * 제어문 - 라벨 문
 *          다중 중첩 반복문의 경우 한번에 모든 반복문을 빠져나가는 문법
 *          break 라벨명;
 */

package src.DAY0213;

public class EX_BreakLabel {
    public static void main(String[] args) {
        // 중첩 반복문 과 break 문
        LABEL:
        for (int dan = 2; dan < 10; dan++) {
            for (int n = 1; n < 10; n++) {
                if ((dan * n) % 7 == 0) {
                    System.out.println("END");
                    break LABEL;
                }
                System.out.printf("%d * %d = %d \n", dan, n, dan * n);
            }
        }
    }    
}
