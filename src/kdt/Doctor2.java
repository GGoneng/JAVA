/*
 * 클래스 설명 : 의사 표현하는 클래스
 * 클래스 이름 : Doctor
 * 클래스 속성 : String name   이름
 *              int age       나이
 *              char gender   성별
 *              String major  전공
 *              int career    경력
 * 클래스 기능 : eat()         먹는다.
 *              sleep()       잔다.
 *              operate()     수술하다.
 *              attenton()    진료하다.
 */

package src.kdt;

public class Doctor2 extends Person{
    // --------------------------------
    // 멤버변수
    // --------------------------------
    private String major;   // 전공
    private int career;     // 경력

    // --------------------------------
    // 생성자 메서드
    // --------------------------------
    // Default Constructor
    public Doctor2() {
        this("none", 0, 'M', "none", 0);
    }

    public Doctor2(String name, String major, int career) {
        this(name, 0, 'M', major, career);
    }

    public Doctor2(String name, int age, char gender, String major, int career) {
        super(name, age, gender);
        this.major = major;
        this.career = career;
    }

    // --------------------------------
    // Getter / Setter 메서드
    // --------------------------------

    public String getMajor() { return this.major; }

    public void setMajor(String major) { this.major = major; }

    public int getCareer() { return this.career; }

    public void setCareer(int career) { this.career = career; }
 
    // --------------------------------
    // 멤버변수
    // --------------------------------

    // -------------------------------------
    // 메서드 역할 : 먹는다.
    // 메서드 이름 : eat
    // 매개 변수들 : String food
    // 메서드 결과 : void 
    // -------------------------------------
    public void eat(String food) {
        System.out.println(this.getName() + " 이/가 " + food + " 을/를 먹는다.");
    }
    

    // -------------------------------------
    // 메서드 역할 : 잔다.
    // 메서드 이름 : sleep
    // 매개 변수들 : - 
    // 메서드 결과 : void 
    // -------------------------------------
    public void sleep() {
        System.out.println(this.getName() + " 이/가 " + "잔다.");
    }

    // -------------------------------------
    // 메서드 역할 : 수술하다.
    // 메서드 이름 : operate
    // 매개 변수들 : String what 수술
    // 메서드 결과 : void 
    // -------------------------------------
    public void operate(String what) {
        System.out.println(this.getName() + " 이/가 " + what + " 수술을 하고 있다.");
    }

    // -------------------------------------
    // 메서드 역할 : 진료하다.
    // 메서드 이름 : attention
    // 매개 변수들 : -
    // 메서드 결과 : void 
    // -------------------------------------
    public void attention() {
        System.out.println(this.getName() + " 이/가 진료한다.");
    }

    
}
