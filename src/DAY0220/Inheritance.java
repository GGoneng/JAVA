package src.DAY0220;

public class Inheritance {

    public static void main(String[] args) {
        B b1 = new B(1, 2, 3);
    }
    
}


class A {
    private int a;
    int b;

    A() {
        System.out.println("A()"); 
    }

    A(int a) {System.out.println("A(int a)");}

    A(int a, int b) {System.out.println("A(int a, int b)");}
}

class B extends A {
    int c;

    B() {
        System.out.println("B()"); 
    }

    B(int c) {System.out.println("B(int c)");}

    B(int a, int b, int c) {
        super(a, b);
        System.out.println("B(int a, int b, int c)");}
}