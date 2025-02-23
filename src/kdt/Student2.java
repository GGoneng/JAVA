/*
 * 클래스 설명 : 학생 표현하는 클래스
 * 클래스 이름 : Student
 * 클래스 속성 : String name   이름
 *              int age       나이
 *              char gender   성별
 *              String school 학교명
 *              
 */
package src.kdt;

public class Student2 extends Person{
    // --------------------------------
    // 멤버변수
    // --------------------------------
    private String school;  // 학교명
    private int grade;      // 학년

    // --------------------------------
    // 생성자 메서드
    // --------------------------------
    // Default Constructor
    public Student2() {
        this("unknown", 0, 'M', "none", 0);
    }

    // Overload Constructor
    public Student2(String name, String school, int grade) {
        this(name, 0, 'M', school, grade);
    }

    public Student2(String name, int age, char gender, String school, int grade) {
        super(name, age, gender);
        this.school = school;
        this.grade = grade;
    }

    // --------------------------------
    // Getter / Setter 메서드
    // --------------------------------

    public String getSchool() { return this.school; }

    public void setSchool(String school) { this.school =school; }

    public int getGrade() { return this.grade; }

    public void setGrade(int grade) { this.grade = grade; }
 
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
        System.out.println(super.getName() + " 이/가 " + food + " 을/를 먹는다.");
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
    // 메서드 역할 : 공부 과목 출력
    // 메서드 이름 : study
    // 매개 변수들 : String subject 과목명
    // 메서드 결과 : void 
    // -------------------------------------
    public void study(String subject) {
        System.out.println(this.getName() + " 이/가 " + subject + " 을/를 공부한다.");
    }
}
