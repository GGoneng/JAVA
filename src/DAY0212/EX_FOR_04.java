package src.DAY0212;

public class EX_FOR_04 {
    public static void main(String[] args) {
        
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 6; j++) {
                System.out.printf("%d * %d = %d    ", j, i, j * i);
            }
            System.out.println();
        }
        System.out.println("\n\n");

        for (int i = 1; i < 10; i++) {
            for (int j = 5; j < 10; j++) {
                System.out.printf("%d * %d = %d    ", j, i, j * i);
            }
            System.out.println();
        }
        
    }
    
}
