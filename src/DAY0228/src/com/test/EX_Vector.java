package src.DAY0228.src.com.test;

import java.util.Vector;

/*
 * Collection Package 중 Vector 클래스
 * - 배열의 고정 길이에 따른 제한 해결 위한 클래스 
 */

public class EX_Vector {
    public static void main(String[] args) {
        // Vector 인스턴스 생성
        Vector<Integer> data = new Vector<Integer>(0);

        // 용량 및 사이즈 체크
        System.out.println("저장 가능 용량 capacity : " + data.capacity());
        System.out.println("저장된 원소 size : " + data.size());

        // 원소 추가
        data.add(10);       // 자동 boxing : int => Integer: Integer.valueOf(10)
        data.add(8);
        data.add(-3);

        System.out.println("저장 가능 용량 capacity : " + data.capacity());
        System.out.println("저장된 원소 size : " + data.size());

        for (int value = 10; value < 71; value += 10) {
            data.add(value);
        }

        System.out.println("저장 가능 용량 capacity : " + data.capacity() + data);
        System.out.println("저장된 원소 size : " + data.size());


        // 원소 삭제
        data.remove(2);
        System.out.println("저장 가능 용량 capacity : " + data.capacity() + data);
        System.out.println("저장된 원소 size : " + data.size());


        // 마지막 원소 삭제
        data.removeLast();
        System.out.println("저장 가능 용량 capacity : " + data.capacity() + data);
        System.out.println("저장된 원소 size : " + data.size());

        
        // 모든 원소 지우기
        data.clear();
        System.out.println("저장 가능 용량 capacity : " + data.capacity() + data);
        System.out.println("저장된 원소 size : " + data.size());
        
    }    
}
