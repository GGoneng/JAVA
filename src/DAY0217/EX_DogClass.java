/*
 * 클래스 정의
 * - 속성과 행동 / 기능 추출
 * - 속    성 ==> 변수 저장
 * - 행동 / 기능 ==> 함수
 */

package src.DAY0217;

public class EX_DogClass {
    
    // 속성(Attribute)
    String kind;     // 품종 / 종류
    String coatColor;// 털 색상
    String eyeColor; // 눈 색상
    float weight;    // 무게

    
    // 행동 / 기능 (Method) ----------------------
    // 메서드 기능 : 짖는다.
    // 메서드 이름 : bark
    // 매개 변수들 : 짖는 소리 => String sound
    // 메서드 결과 : 없음
    // 반환타입 메서드 이름 (매개 변수들) {}
    
    void bark(String sound) { 
        System.out.println(sound);
    }

    // 메서드 기능 : 꼬리친다.
    // 메서드 이름 : tailing
    // 매개 변수들 : 없음
    // 메서드 결과 : 없음
    // 반환타입 메서드 이름 (매개 변수들) {}

    void tailing() {
        System.out.println("신나게 꼬리친다");
    }


    public static void main(String[] args) {
        System.out.println("TEST");

        // 객체 생성 =>  클래스명 변수명 = new 클래스명()
        // 변수명은 메모리 힙에 저장된 객체의 주소를 저장, 레퍼런스 변수

        EX_DogClass dog = new EX_DogClass();

        System.out.println("dog => " + dog);
    }
    
}
