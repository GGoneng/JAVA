package src.DAY0228.src.com.test;

import src.DAY0228.src.com.model.*;

/*
 * Object 클래스의 메서드 오버라이딩딩
 */

public class EX_Object01 {
    public static void main(String[] args) {
        // 인스턴스 생성
        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 10);
        Point p3 = p1;


        // 인스턴스 문자열 정보 출력
        System.out.println(p1.toString());
    
    
        // 2개의 인스턴스를 비교 결과 출력
        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1 == p3 : " + (p1 == p3));
        System.out.println("p1.equals(p2) : " + (p1.equals(p2)));
        System.out.println("p1.equals(p3) : " + (p1.equals(p3)));
    }   
}
