/*
 * 제어문 - for 반복문
 */
package src.DAY0212;

public class EX_FOR_03 {
    public static void main(String[] args) {
        // 아무것도 반복하지 않는 반복문
        System.out.println("START");

        for (int idx = 0; idx < 1000000; idx++);

        for (int idx = 0; idx < 1000; idx++) {};

        System.out.println("END");

        // 무한 반복문
        for (;;) {}

        
    }
}
