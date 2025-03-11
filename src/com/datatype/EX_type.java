package src.com.datatype;

/*
 * 기본 자료형과 참조 자료형의 형 변환환
 */

public class EX_type {
    public static void main(String[] args) {
        // [1] 기본 자료형 => 스택에 저장 int, float, char, boolean
        int num = 10;
        float fnum = 4.5f;

        num = (int)fnum;  // 명시적 형 변환 즉, 데이터 손실 발생
        System.out.println("num : " + num);

        // [2] 참조 자료형 => 힙에 저장 String, Array, ... 즉, 인스턴스
        String age = "10";

        // String ==> int : 인스턴스 타입 => int 타입
        // num = (int)age; // 불가
        // 인스턴스 타입 => int 인스턴스 타입 => Integer 클래스 : 랩퍼(Wrapper) 클래스
        num = Integer.parseInt(age);

        System.out.println("num : " + num);
        
        
    }
}
