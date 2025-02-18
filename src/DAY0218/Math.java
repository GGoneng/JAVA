/*
 * 클래스 기능 : 수학 관련 속성과 기능 구성된 클래스 
 * 클래스 이름 : Math
 * 클래스 속성 :  -
 * 클래스 메서드 : 합계, 평균
 * 
 */

package src.DAY0218;

public class Math {
    // 멤버 속성


    // 메서드 - 생성자(Constructor) : 클래스명과 동일한 메서드명
    //                               반환값 미지정
    // - Default 생성자
    Math() {
        System.out.println("Math 생성자");
      }                      

    // 메서드 - 인스턴스
    // --------------------------------------------
    // 메서드 이름 : getSum
    // 매개 변수들 : 정수 3개 int a, int b, int c
    // 메서드 결과 : 합계 즉, int
    // --------------------------------------------

    int getSum(int a, int b, int c) {
        return a + b + c;
    }

    // --------------------------------------------
    // 메서드 이름 : getSum
    // 매개 변수들 : 실수 3개 float a, float b, float c
    // 메서드 결과 : 합계 즉, float
    // --------------------------------------------

    float getSum(float a, float b, float c) {
        return a + b + c;
    }

    // --------------------------------------------
    // 메서드 이름 : getSum
    // 매개 변수들 : 정수 4개 int a, int b, int c, int b
    // 메서드 결과 : 합계 즉, int
    // --------------------------------------------

    int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // --------------------------------------------
    // 메서드 이름 : getAvg
    // 매개 변수들 : 정수 3개 int a, int b, int c
    // 메서드 결과 : 평균 즉, float
    // --------------------------------------------

    float getAvg(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
