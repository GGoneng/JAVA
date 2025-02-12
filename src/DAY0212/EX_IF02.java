/*
 * 제어문 - 조건문 다중 IF
 */

package src.DAY0212;

import java.util.Scanner;

public class EX_IF02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요 : ");
        int jumsu = scan.nextInt();

        if (jumsu >= 90) 
            System.out.printf("%d - %s \n", jumsu, "A학점");
        else if (jumsu >= 80)
            System.out.printf("%d - %s \n", jumsu, "B학점");
        else if (jumsu >= 70)
            System.out.printf("%d - %s \n", jumsu, "C학점");
        else if (jumsu >= 60)
            System.out.printf("%d - %s \n", jumsu, "D학점");
        else
            System.out.printf("%d - %s \n", jumsu, "F학점");    
    
        scan.close();
    }
    
}