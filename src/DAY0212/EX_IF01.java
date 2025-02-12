/*
 * 제어문 - 조건문
 */
package src.DAY0212;

public class EX_IF01 {
    public static void main(String[] args) {
        // 짝수 홀수 구분
        int num = 11;

        // 짝수 홀수 여부 출력
        if (num % 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }

        // 짝수 홀수 여부 출력
        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // 삼항 연산자 ? :

        String msg = (num % 2 == 0) ? "짝수" : "홀수";

        System.out.println(msg);
        System.out.println((num % 2 == 0) ? "짝수" : "홀수");
    }
    
}
