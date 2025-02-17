/*
 * 제어문 - do ~ while 반복문
 */

package src.DAY0213;

public class EX_DoWhile_02 {
    public static void main(String[] args) {
        // 문자 타입과 연산
        char ch = 0; // 정수수

        System.out.println(ch + 1);
        System.out.println(ch + 10);

        ch = 'A'; // 아스키 코드 값 48
        System.out.println(ch + 1);
        System.out.printf("%d -> %c\n", ch + 1, (char)(ch + 1));

        System.out.println(ch + 10);
        System.out.println((char)(ch + 10));
        
        System.out.println('A' + 'C');
        System.out.println((char)('A' + 'C'));

        // a ~ z까지 출력
        do {
            System.out.println(ch);
            ch++;
        } while (ch < 'a');
    }

}
