package src.DAY0212;

public class EX_FOR_05 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 8 - i; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j < 8 + 2 * (i - 4) ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 5; i > 1; i--) {   
            for (int j = 8; j > i; j--) {
                System.out.print(' ');
            }

            for (int j = 8; j > 1 + 2 * (5 - i); j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
}
