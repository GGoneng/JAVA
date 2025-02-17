/*
 * 이차원 비정방향 배열 선언 및 활용
 * - 비정방향 배열 : 행마다 원소 갯수가 다른 배열
 */

package src.DAY0217;

public class EX_TwoArray02 {
    public static void main(String[] args) {
        // 2차원 배열 선언 및 초기화
        int intArray[][];

        intArray = new int[2][];

        // 행마다 원소 갯수 설정
        // intArray[0] = new int[3];
        // intArray[1] = new int[5];

        // 행마다 원소 값 설정 => 원소 갯수만큼 크기 잡음
        intArray[0] = new int[]{10, 20, 30};
        intArray[1] = new int[]{3, 6, 9, 12, 15};
    
        // 원소 출력 - 일반적인 for
        for (int row = 0; row < intArray.length; row++) {
            System.out.println("[" + row + "행]");
            for (int col = 0; col < intArray[row].length; col++) {
                System.out.println(intArray[row][col]);
            }
        }

        // 원소 출력 - 향상된 for
        for (int[] rowArray : intArray) {
            for (int element : rowArray) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
