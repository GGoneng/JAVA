/*
 * 제어문 - for 반복문
 */

package src.DAY0213;

public class EX_For_02 {
    public static void main(String[] args) {
        // 구구단 출력 - 3단 출력
        // 3 * 1 = 3
        // 3 * 2 = 6
        // 3 * 3 = 9
        // 3 * 4 = 12
        // ...
        
        for (int n = 1; n < 10; n++) {
            System.out.printf("3 * %d = %d\n", n, 3 * n);
        }

        // 구구단 2단 ~ 9단 출력
        for (int dan = 2; dan < 10; dan++) {
            System.out.printf("[%d단]\n", dan);
            
            for (int n = 1; n < 10; n++) {
                System.out.printf("%d * %d = %d\n", dan, n, dan * n);
            }
        }
    }
    
}
