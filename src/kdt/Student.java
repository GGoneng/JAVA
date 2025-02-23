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

public class Student {
    // --------------------------------
    // 멤버변수
    // --------------------------------
    private String name;    // 이름
    private int age;        // 나이
    private char gender;    // 성별
    private String school;  // 학교명
    private int grade;      // 학년

    // --------------------------------
    // 생성자 메서드
    // --------------------------------
    // Default Constructor
    public Student() {
        this("unknown", 0, 'M', "none", 0);
    }

    // Overload Constructor
    public Student(String name, String school, int grade) {
        this(name, 0, 'M', school, grade);
    }

    public Student(String name, int age, char gender, String school, int grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.school = school;
        this.grade = grade;
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

    // -------------------------------------
    // 메서드 역할 : 공부 과목 출력
    // 메서드 이름 : study
    // 매개 변수들 : String subject 과목명
    // 메서드 결과 : void 
    // -------------------------------------
    public void study(String subject) {
        System.out.println(this.name + " 이/가 " + subject + " 을/를 공부한다.");
    }
}
