package src.DAY0228.src.com.test;

import java.util.Vector;
import src.DAY0228.src.com.model.*;

public class EX_Vector02 {

    // 클래스 메서드 : 벡터 정보 및 원소 출력 ------------
    public static void printInfo(Vector<Point> v) {
        System.out.printf("저장 가능 용량 %d, 저장된 원소 %d\n", v.capacity(), v.size());
        System.out.println(v);
    } 

    // 프로그램 시작점
    public static void main(String[] args) {
        // Vector 인스턴스 생성
        Vector<Point> data = new Vector<Point>(0);

        // 용량 및 사이즈 체크
        printInfo(data);

        // 원소 추가
        data.add(new Point(5, 5));
        data.add(new Point());

        printInfo(data);

    }
}
