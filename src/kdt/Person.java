/*
 * 클래스 설명 : 사람 표현하는 클래스
 * 클래스 이름 : Person
 * 클래스 속성 : String name   이름
 *              int age       나이
 *              char gender   성별
 * 클래스 기능 : eat()         먹는다.
 *              sleep()       잔다.
 */

package src.kdt;

public class Person {
    // --------------------------
    // 멤버 변수
    // --------------------------
    private String name;
    private int age;
    private char gender;

    // --------------------------
    // 생성자 메서드
    // --------------------------
    // Default Constructor
    public Person() {}

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // --------------------------------
    // Getter / Setter 메서드
    // --------------------------------
    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; }

    public int getAge() { return this.age; }

    public void setAge(int age) { this.age = age; }

    public char getGender() { return this.gender; }

    public void setGender(char gender) { this.gender = gender; }

    // --------------------------------
    // 메서드드
    // --------------------------------

    // -------------------------------------
    // 메서드 역할 : 먹는다.
    // 메서드 이름 : eat
    // 매개 변수들 : String food
    // 메서드 결과 : void 
    // -------------------------------------
    public void eat(String food) {
        System.out.println(this.name + " 이/가 " + food + " 을/를 먹는다.");
    }
    

    // -------------------------------------
    // 메서드 역할 : 잔다.
    // 메서드 이름 : sleep
    // 매개 변수들 : - 
    // 메서드 결과 : void 
    // -------------------------------------
    public void sleep() {
        System.out.println(this.name + " 이/가 " + "잔다.");
    }
}
