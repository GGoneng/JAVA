/*
 * 원 클래스 정의 및 활용
 * - 속성 : 반지름, 이름
 * - 메서드 : 원의 넓이 계산
 */

package src.DAY0217;

public class Circle {
    // 속성
    int radius;
    String name;

    // 생성자 메서드 ------------------------------------------------
    // 조건 : 클래스 이름과 동일한 메서드 이름
    //       반환값 없음
    // 특징 : 매개 변수 없는 생성자 ==> 기본 / 디폴트 생성자
    Circle(int r, String c_name) {
        System.out.println("나는 생성자!! 호출됨");
        // 클래스 속성명 = 저장 값
        radius = r;
        name = c_name;
    }

    // 클래스의 역할 / 행동 / 기능 메서드 -----------------------------
    // 메서드 기능 : 원의 넓이 계산 후 반환
    // 메서드 이름 : getArea
    // 매개 변수들 : 반지름
    // 메서드 결과 : 넓이 값 반환

    double getArea() {
        double area = 3.14 * radius * radius;
        
        return area;
    }

    // 


    // 프로그램 시작 및 제어 메서드 ----------------------------------
    public static void main(String[] args) {
        // 객체 생성
        Circle c1 = new Circle(5, "동그라미5");

        // 객체 속성 출력
        System.out.println("c1.name : " + c1.name);
        System.out.println("c1.radius : " + c1.radius);

        // 객체 속성 설정
        c1.name = "원1";
        c1.radius = 4;

        System.out.println("c1.name : " + c1.name);
        System.out.println("c1.radius : " + c1.radius);

        // 객체 메서드 실행
        double result = c1.getArea();
        System.out.println("result : " + result);

    }
}
