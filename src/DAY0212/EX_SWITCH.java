/*
 * 제어문 - 조건문 switch ~ case 문
 */

package src.DAY0212;

public class EX_SWITCH {
    public static void main(String[] args) {
        // 학점 출력
        int jumsu = 87;
        char grade = 0;

        System.out.println(jumsu / 10);

        switch(jumsu / 10) {
            case 10:
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            case 6 :
                grade = 'D';
                break;
            default :
                grade = 'F';
                break;
        }

        System.out.printf("%d -  %c학점 \n", jumsu, grade);
    }

}
