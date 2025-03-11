package src.DAY0228.src.com.model;

/*
 * 클래스 역할 : 2차원 좌표 값 저장 표현 클래스
 * 클래스 이름 : Point
 * 클래스 속성 : int x , int y
 * 클래스 기능 : 점 그리기 기능 drawing
 *              인스턴스 설명 기능 Object의 toString 오버라이딩
 */

public class Point {

    // Member Field / Attribute / Variable ----------------
    private int x;
    private int y;


    // Constructor Method - Overloading -------------------
    public Point() { this(0, 0); }
    
    public Point(int x,  int y) {
        this.x = x;
        this.y = y;
    }
    
    
    // Getter / Setter Method -----------------------------
    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    
    // Overriding Method ----------------------------------
    @Override
    public String toString() {
        // return super.toString();     // 클래스 전체 이름 @해시코드 src.DAY0228.src.com.model.Point@2a3046da
        return "(" + this.x + ", " + this.y + ")";
    }


    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()");
        
        // 부모 / 슈퍼 클래스 ==> 자식 / 서브 클래스 : Down-casting
        Point pObj = (Point)obj;

        // Point 인스턴스의 좌표값을 비교해서 동일 좌표값 여부
        if ((this.x == pObj.getX()) && (this.y == pObj.getY()))
            return true;
        else 
            return false;
    }
    
    // Member Method --------------------------------------
    public void drawing() {
        // ● <- (x, y)
        // System.out.println("●" + "<-( " + this.x + ", " + this.y + " )");
        System.out.printf("● <- ( %d, %d )\n", this.x, this.y);
    }
}
