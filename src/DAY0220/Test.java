/*
 * 클래스 테스트용용
 */

package src.DAY0220;

public class Test {
    public static void main(String[] args) {
        // Point 인스턴스 생성 
        // Point p1 = new Point();
        // p1.drawingPoint();


        // ColorPoint 인스턴스 생성
        ColorPoint cp1 = new ColorPoint();

        // 메서드 호출
        cp1.drawingColor();
        cp1.drawingPoint();

        // getInfo()는 부모 클래스, 자식 클래스 2군데 모두 존재
        //                          자기 클래스 내의 메서드 실행
        System.out.println(cp1.getInfo());
        
        // 속성 사용
        cp1.setX(50);
        cp1.setY(30);
        
    }
}
