/*
 * 객체 생성 및 테스트 => 프로그램 제어 클래스
 */

package src.DAY0217;

public class Exam {
    public static void main(String[] args) {
        // Person 인스턴스 생성
        Person kim = new Person("김유신", 10, 'M', 124.5f, 30.1f);
        Person ma = new Person("마징가", 17, 'F', 168.5f, 52.5f);
        Person park = new Person("박지성", 27, 'M', 177.5f, 76.5f);
    
        // Person 인스턴스 메서드 실행
        // 변수명.메서드명();
        kim.eat("쌀국수");
        park.eat("피자");

        ma.sleep();
        kim.sleep();
        park.sleep();
    }
}
