package src.DAY0218;

import java.util.Scanner;

public class Calculator_main {
    public static void main(String[] args) {
        float num = 0;
        char input = 'N';

        Calculator cal = new Calculator();

        Scanner scan = new Scanner(System.in);
        
        for (;;) {
            System.out.print("입력 예시 : (+ 10) ");
            input = scan.next().charAt(0);

            if (input == 'C') {
                cal.clearHistory();
                continue;
            }
            
            else if (input == 'F') {
                System.out.println("계산기를 종료합니다.");
                break;
            }
            
            num = scan.nextFloat();
            
            if (input == '+') cal.Plus(num);
            else if (input == '-') cal.Minus(num);
            else if (input == '*') cal.Multiply(num);
            else if (input == '%') cal.Divide(num);
            else System.out.println("잘못된 입력입니다.");
        }

        scan.close();
    }
}
