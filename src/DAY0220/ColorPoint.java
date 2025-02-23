/*
 * 클래스 역할 : 평면 좌표에 찍히는 점 정보 저장 클래스
 * 클래스 이름 : ColorPoint
 * 부모 클래스 : Point
 * 클래스 속성 : int x, int y
 * 클래스 기능 : 점찍기 기능, 정보 출력 기능
 */

package src.DAY0220;

public class ColorPoint extends Point {
    // ----------------------------
    // 멤버 변수
    // ----------------------------
    
    // 인스턴스 멤버 변수
    // private int x;
    // private int y;
    private String color;


    // ----------------------------
    // 생성자 메서드
    // ----------------------------
    ColorPoint() {
        this(0, 0, "Black");
    }

    ColorPoint(int x , int y, String color) {
        // this.x = x;
        // this.y = y;
        super(x, y, "rectangle");
        this.color = color;
        System.out.println("CP");
    }


    // ----------------------------
    // Getter / Setter 메서드
    // ----------------------------
    // public int getX() { return this.x; }
    // public void setX(int x) { this.x = x; }

    // public int getY() { return this.y; }
    // public void setY(int y) { this.y = y; }

    public String getColor() { return this.color; }
    public void setColor(String color) { this.color = color; }

    // ----------------------------
    // 멤버 메서드
    // ----------------------------
    // 메서드 기능 : 색상 그리기
    // 메서드 이름 : drawingColor
    // 매개 변수들 : -
    // 메서드 결과 : void
    public void drawingColor() {
        System.out.println(this.color);
    }

    // 메서드 기능 : 정보 출력 기능
    // 메서드 이름 : getInfo
    // 매개 변수들 : -
    // 메서드 결과 : 정보 문자열 String
    public String getInfo() {
        return this.color;
    }
    
}
