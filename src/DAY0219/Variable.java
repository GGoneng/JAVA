/*
 * 클래스 역할 : 다양한 변수 종류 확인용
 * 클래스 이름 : Variable
 * 클래스 속성 : 다양한 종류의 변수들 선언
 */

package src.DAY0219;

public class Variable {
    // --------------------------------
    // 멤버 변수
    // --------------------------------
    // 클래스 변수 - 공유 속성 / 변수
    static int code;

    // 인스턴스 변수 - new 키워드로 인스턴스 생성 시 사용 가능
    private String id;
    private String name;

    // ---------------------------------------------------
    // 생성자 메서드 : 클래스 이름과 동일한 이름, 반환 문법 X
    //                클래스 이름(){} - 기본 / Default 생성자
    //                                 생성자가 1개도 없으면 컴파일러가 자동 생성
    // ---------------------------------------------------
    // Default Constructor 생성자
    Variable() {
        this("none", "unknown");
        System.out.println("생성자 Variable()");
        // this.id = "none";
        // this.name = "unknown";
    }

    // 1개 속성 초기화 생성자
    Variable(String id) {
        this(id, "unknown");
        System.out.println("생성자 Variable(String)");
        // this.id = id;
        // this.name = "unknown";
    }

    // 2개 속성 초기화 생성자
    Variable(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("생성자 Variable(String, String)");
    }



    // ---------------------------------------------------
    // Getter / Setter 메서드 : 속성 간접 접근 메서드
    // - get속성명() : 속성 값 읽어서 반환
    // - set속성명(새로운 값) : 속성값 적용
    // ---------------------------------------------------

    public String getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // -------------------------------------------
    // 멤버 메서드 => 클래스 메서드, 인스턴스 메서드
    // -------------------------------------------
    // 메서드 기능 : 고객 정보 출력 기능
    // 메서드 이름 : printInfo
    // 매개 변수들 : 인스턴스 내부의 속성 / 변수 사용. 추가 필요 X
    // 메서드 결과 : void

    public void printInfo() {
        System.out.println("id : " + this.id);
        System.out.println("name : " + this.name);
    }

    // 메서드 기능 : 인사 메세지 출력 기능
    // 메서드 이름 : hello
    // 매개 변수들 : 인스턴스 내부의 속성 / 변수 사용 X, 추가 필요 X
    // 메서드 결과 : void
    //              인스턴스 생성 없이 사용 가능한 메서드

    static void hello() {
        System.out.println("HELLO~");
    }

    public static void hello2() {
        System.out.println("HELLO~");
    }
}
