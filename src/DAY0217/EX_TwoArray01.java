/*
 * 이차원 배열 선언 및 활용
 */

package src.DAY0217;

public class EX_TwoArray01 {
    public static void main(String[] args) {
        // 2차원 배열 선언 및 초기화
        int intArray[][];

        intArray = new int[2][3]; // 0으로 초기화

        // 배열 원소 값 출력
        System.out.println("0번행 주소 : " + intArray[0]);
        System.out.println("0번행의 0번 원소 : " + intArray[0][0]);

        System.out.println("1번행 주소 : " + intArray[1]);
        System.out.println("1번행의 0번 원소 : " + intArray[1][0]);

        // 배열 원소 값 넣기
        for (int idx = 0; idx < intArray.length; idx++) {
            // 각 행 별로 원소에 값 넣기
            for (int col = 0; col < intArray[idx].length; col++) {
                intArray[idx][col] = idx + col;
            }
        }

        // 배열 원소 값 모두 출력 => for ~ each 문 작성
        // 원소 담을 변수명 : 2D 배열명
        for (int[] rowArray : intArray) {
            // 원소 담을 변수 : 1D 배열명
            for (int value : rowArray) {
                System.out.println(value);
            }
        }
    }
}
