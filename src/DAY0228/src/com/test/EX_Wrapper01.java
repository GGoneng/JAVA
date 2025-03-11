package src.DAY0228.src.com.test;

/*
 * 기본 데이터 ===> 클래스화 한 것 Wrapper 클래스라 함
 * - int ==> Integer 클래스
 * - char ==> Character 클래스
 * - float ==> Float 클래스
 */

public class EX_Wrapper01 {
    public static void main(String[] args) {
        // int ==> Integer 즉, 레퍼런스 타입으로 변환
        int num = 7;

        Integer iNum1 = Integer.valueOf(num);
        Integer iNum2 = Integer.valueOf("7");

        System.out.println("num => " + num);
        System.out.println("iNum1 => " + iNum1);
        System.out.println("iNum2 => " + iNum2);

        // Integer ==> int 타입 변환
        System.out.println("intValue() => " + iNum1.intValue());

        // String ==> int 타입 반환
        System.out.println(Integer.valueOf("7").intValue());
        System.out.println(Integer.parseInt("7"));

        // --------------------------------------------------------
        // Boxing & UnBoxint 자동 형변환 : 기본 타입 <-> Wrapper 타입
        int a = 10;

        // -> Boxing 자동화
        Integer ten = Integer.valueOf(a);
        Integer ten1 = a;

        // -> Unboxing 자동화
        int b = ten.intValue();
        int c = ten;
    }
}
