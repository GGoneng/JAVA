/*
 * 사람 데이터를 정의하는 클래스
 * - 속성 : 이름, 나이, 성별, 키, 몸무게
 * - 행동 : 먹는다. 잔다.
 */

package src.DAY0217;

public class Person {
    
    // 속성 ----------------------------------
    String name;    // 이름
    int age;        // 나이
    char gender;    // 성별
    float height;   // 키
    float weight;   // 몸무게

    // 생성자 메서드 ----------------------------
    // 메서드 기능 : 메모리 힙 영역에 객체 생성 시 속성 초기화 기능
    // 메서드 이름 : 클래스 명과 동일
    // 메서드 결과 : 미선언
    Person(String name_, int age_, char gender_, float height_, float weight_) {
        // 속성명 = 값;
        name = name_;
        age = age_;
        gender = gender_;
        height = height_;
        weight = weight_;
    }

    // 인스턴스 메서드 ------------------------------------
    // 메서드 기능 : 먹는다 기능
    // 메서드 이름 : eat
    // 매개 변수들 : 음식명 String food
    // 메서드 결과 : 없음
    void eat(String food) {
        System.out.println(food + " 먹는다.");
    }

    // 메서드 기능 : 잔다 기능
    // 메서드 이름 : sleep
    // 매개 변수들 : 없음
    // 메서드 결과 : 없음

    void sleep() {
        System.out.println(name + "이/가 잔다.");
    }


}
