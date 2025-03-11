package src.DAY0226;

public class Person implements AnimalInterface, FlyInterface {
    

    // Member Field / Attribute / Variable --------------------
    private String name;
    private char gender;
    private int age;


    // Constructor Method -------------------------------------
    public Person() {  }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // - AnimalInterface's Override method --------------------
    @Override
    public void eat() {

    }

    @Override
    public void eat(String food) {
        System.out.println(food + " 를 먹고 있다.");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {
        System.out.println("잔다.");
    }

    @Override
    public boolean takeoff(String where) {
        System.out.println(where + "에서 이륙한다.");
        return true;
    }

    @Override
    public void takeoff() {

    }

    @Override
    public boolean landing(String where) {
        System.out.println(where + "에서 착륙한다.");
        return true;
    }

    @Override
    public void landing() {

    }

    @Override
    public boolean fly(String where) {
        System.out.println(where + "에서 날고 있다.");
        return true;
    }

    @Override
    public void fly() {

    }
} 
