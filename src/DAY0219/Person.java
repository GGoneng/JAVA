/*
 * 클래스 역할 : 사람 정보 저장 클래스
 * 클래스 이름 : Person
 * 클래스 속성 : gender, age, height, weight, name, loc
 * 클래스 기능 : 먹는다 eat, 잔다 sleep, 논다 play, 정보 출력 printInfo
 */

package src.DAY0219;

public class Person {
    // ---------------------------------------
    // 멤버 변수
    // ---------------------------------------

    // 클래스 변수
    public static final String LOC = "대한민국";

    // 인스턴스 변수
    private char gender;
    private int age;
    private float height;
    private float weight;
    private String name;
    // private String loc;

    // ---------------------------------------
    // 생성자 메서드
    // ---------------------------------------

    Person() {
        this('N', 0, 0.f, 0.f, "Unknown");
    }

    Person(char gender) {
        this(gender, 0, 0.f, 0.f, "Unknown");
    }

    Person(char gender, int age) {
        this(gender, age, 0.f, 0.f, "Unknown");
    }

    Person(char gender, int age, float height) {
        this(gender, age, height, 0.f, "Unknown");
    }

    Person(char gender, int age, float height, float weight) {
        this(gender, age, height, weight, "Unknown");
    }

    Person(char gender, int age, float height, float weight, String name) {
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }
    


    // ---------------------------------------
    // Getter / Setter 메서드
    // ---------------------------------------

    public char getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWeight() {
        return this.weight;
    }

    public String getName() { 
        return this.name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ---------------------------------------
    // 멤버 메서드
    // ---------------------------------------

    /*
     * 메서드 역할 : 음식을 먹는다 메세지 출력
     * 메서드 이름 : eat
     * 매개 변수들 : 음식 String food
     * 메서드 결과 : void
     */
    public void eat(String food) {
        System.out.println(this.name + " 이/가 " + food + "를 먹는다.");
    }

    /*
     * 메서드 역할 : 잔다 메세지 출력
     * 메서드 이름 : sleep
     * 매개 변수들 : 장소 String place
     * 메서드 결과 : void
     */

    public void sleep(String place) {
        System.out.println(this.name + " 이/가 " + place +"에서 잔다.");
    }

    /*
     * 메서드 역할 : 논다 메세지 출력
     * 메서드 이름 : play
     * 매개 변수들 : 무엇을 String what
     * 메서드 결과 : void
     */    

    public void play(String what) {
        System.out.println(this.name + " 이/가 " + what + " 을/를 하고 논다.");
    }

    /*
     * 메서드 역할 : 정보 출력 메세지 출력
     * 메서드 이름 : printInfo
     * 매개 변수들 : -
     * 메서드 결과 : void
     */
    
    public void printInfo() {
        System.out.println("==================");
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("gender : " + this.gender);
        System.out.println("height : " + this.height);
        System.out.println("weight : " + this.weight);
        System.out.println("loc : " + LOC);
        // System.out.println("운동 : " + what);   // play 메서드의 매개 변수 사용 X.
        System.out.println("==================");
    }

}
