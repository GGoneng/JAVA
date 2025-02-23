/*
 * 상속과 다형성
 */

package src.kdt;

public class EX_Poly2 {
    
    // Class Method
    // Shape instance, Chile Instance
    public static void runMethod(Point p) {
        p.draw();
    }

    public static void painting(ColorPoint cp) {
        System.out.println(cp.color + " 페인팅~");
    }


    // Program Entry Point
    // [Object overriding Practive]
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);
    }


    // // [Inheritance & Polymorphism practice]
    // public static void main(String[] args) {
    //     Point p1 = new Point();
    //     ColorPoint cp1 = new ColorPoint(20, 40, "red");
    //     Point3D pd = new Point3D(10, 10, 10);

    //     // Calling a Method with an Instance as a Parameter
    //     EX_Poly2.runMethod(p1);
    //     EX_Poly2.runMethod(cp1);
    //     EX_Poly2.runMethod(pd);

    //     // Parameter - ColorPoint Instance O, Parent Instance X, Sibling Instance X
    //     EX_Poly2.painting(cp1);
    //     // EX_Poly2.painting(p1);   // ERROR
    //     // EX_Poly2.painting(pd);   // ERROR
    // }



}

class Point {
    // Instance Variable
    int x;
    int y;


    // Constructor Method
    Point() { }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // redefine Object Class' Method 
    @Override
    public String toString() {
        // System.out.println("toString()");
        // return super.toString();
        return "GOOD";
    }

    //-----------------------------------
    // Instance Method
    // ----------------------------------
    // Everywhere can use
    public void draw() {
        System.out.println("[public Access Modifier] (" + this.x + "," + this.y + ")");
    }

}

// Child Classes that inherit Point Class --------------
class ColorPoint extends Point {
    // Instance Variable
    String color;

    // Constructor Method
    ColorPoint() { }

    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
}

class Point3D extends Point {
    // Instance Variable
    int z;

    // Constructor Method
    Point3D() { }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}