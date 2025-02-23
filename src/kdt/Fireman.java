/*
 * 클래스 설명 : 소방관 표현하는 클래스
 * 클래스 이름 : Fireman
 * 클래스 속성 : String name   이름
 *              int age       나이
 *              char gender   성별
 *              String group  그룹명
 *              int grade     직급
 */
package src.kdt;

public class Fireman {
    // --------------------------------
    // 멤버변수
    // --------------------------------
    private String name;    // 이름
    private int age;        // 나이
    private char gender;    // 성별
    private String group;   // 그룹명
    private int grade;      // 직급

    // --------------------------------
    // 생성자 메서드
    // --------------------------------
    // Default Constructor
    public Fireman() {
        this("unknown", 0, 'M', "none", 0);
    }

    // Overload Constructor
    public Fireman(String name, String group, int grade) {
        this(name, 0, 'M', group, grade);
    }

    public Fireman(String name, int age, char gender, String group, int grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.group = group;
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

    public String getGroup() { return this.group; }

    public void setSchool(String group) { this.group = group; }

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
    // 메서드 역할 : 불끄다.
    // 메서드 이름 : extinguish
    // 매개 변수들 : String where 장소
    // 메서드 결과 : void 
    // -------------------------------------
    public void extinguish(String where) {
        System.out.println(this.name + " 이/가 " + where + " 에서 불을 끄고 있다.");
    }
}
