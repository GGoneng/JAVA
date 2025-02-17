/*
 * 제어문 - break 문
 *          가장 가까이 있는 반복문만 종료함
 *          중첩의 경우 가까이 있는 반복문만 종료
 */

package src.DAY0213;

public class EX_Break {
    public static void main(String[] args) {
        // 중첩 반복문 과 break 문
        for (int dan = 2; dan < 10; dan++) {
            for (int n = 1; n < 10; n++) {
                if ((dan * n) % 7 == 0) {
                    System.out.println("END");
                    break;
                }
                System.out.printf("%d * %d = %d \n", dan, n, dan * n);
            }
        }

        // 중첩 반복문과 break 문 --> 반복문 모두 중단
        // 내부에 반복문 중단여부 정보 저장 변수

        boolean isEnd = false;

        for (int dan = 2; dan < 10; dan++) {
            // 밖에 for문은 안에 for문이 종료되었으면 종료하기 ==> Flag 변수

            if (isEnd == true) break;

            for (int n = 1; n < 10; n++) {
                if ((dan * n) % 7 == 0) {
                    System.out.println("END");
                    isEnd = true;
                    break;
                }
                System.out.printf("%d * %d = %d \n", dan, n, dan * n);
            }
        }
    }    
}
