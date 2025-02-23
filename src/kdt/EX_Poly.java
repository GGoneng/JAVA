/*
 * 상속과 다형성
 */

package src.kdt;

public class EX_Poly {
    
    // Class Method
    // Shape instance, Chile Instance
    public static void runMethod(Shape s) {
        s.draw();
    }

    public static void calc(int num) {
        System.out.println(num * num * num);
    }

    // Program Entry Point
    // [Overriding practive]
    public static void main(String[] args) {
        
        EX_Poly.calc(7);
        EX_Poly.calc((int)6.5);

        // Parent Shape => Child Line, Circle, Rectangle
        // Polymorphism
        Shape ss = new Shape();
        EX_Poly.runMethod(ss);
    
        Line ll = new Line();
        Circle cc = new Circle();

        EX_Poly.runMethod(ll);
        EX_Poly.runMethod(cc);
    }



// [Overriding practice]
// 프로그램 진입점 Entry Point
// public static void main(String[] args) {
//     // Make Instance
//     Shape s1 = new Shape();
//     Line l1 = new Line();
//     Circle c1 = new Circle();

//     // Call instance method
//     s1.draw();
//     l1.draw();
//     c1.draw();

//     l1.painting("red");
//     l1.remove(true);
// }

}

class Shape {
    
    // Constructor Method
    Shape() {

    }

    //-----------------------------------
    // Instance Method
    // ----------------------------------
    // Everywhere can use
    public void draw() {
        System.out.println("[public Access Modifier] Drawing~");
    }

    // Only this class can use
    private void printMessage() {
        System.out.println("[private Access Modifier] *^__________^*");
    }

    // Default Access Modifier
    void painting(String color) {
        System.out.println("[default Access Modifier] " + color + " 도형");
    }
    
    // Inheritance or Same package can use
    protected void remove(boolean isall) {
        System.out.print("[protected Access Modifier] 지울까요? " + isall);
    }
}

// Child Class that inherits Shape Class -------------------
class Line extends Shape {

    @Override
    public void draw() {
        System.out.println("Draw blue line -----------!!");
    }


}

class Rectangle extends Shape {
    
    @Override
    public void draw() {
        System.out.println("-----");
        System.out.println("|   |");
        System.out.println("-----");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("O");
    }
}