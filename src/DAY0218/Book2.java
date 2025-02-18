/*
 * 클래스 역할 : 도서 정보 저장
 * 클래스 이름 : Book
 * 클래스 속성 : 제목, 저자, 출간년도
 * 클래스 기능 : 도서 정보 출력
 */

package src.DAY0218;

class Book2 {
    // ------------------------------------
    // - 멤버 속성
    // ------------------------------------
    private String       title;   // 제목
    String       author;  // 저자
    private int          year;     // 출간년도


    // ------------------------------------
    // - 생성자 메서드
    // ------------------------------------
    // Default 생성자 : 매개 변수 X

    Book2() {
        // this.title = "unknown";
        // this.author = "unknown";
        // this.year = 0;
    
        this("unknown", "unknown", 0);
    }


    // 제목, 저자만 초기화 생성자
    Book2(String title, String author) {
    //  this.title = title;
    //  this.author = author;
        this(title, author, 0);    
    }


    // 속성 모두 초기화 생성자
    Book2(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // -----------------------------------------
    // - getter / setter 메서드
    // * private 멤버 속성 읽기 / 쓰기 기능 메서드
    // * get속성명() => 해당 속성값 반환
    // * set속성명(새로운 값) => 해당 속성값 변경
    // -----------------------------------------

    // - 멤버 속성 title
    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    // - 멤버 속성 year
    int getYear() {
        return this.year;
    }


    // -------------------------------------
    // - 인스턴스 메서드
    // -------------------------------------
    // 메서드 기능 : 도서 정보 출력 기능
    // 메서드 이름 : printInfo
    // 매개 변수들 :     -
    // 메서드 결과 :    void
    // -------------------------------------

    void printInfo() {
        System.out.println("---------------------");
        System.out.println("도서명 : " + this.title);
        System.out.println("저자 : " + this.author);
        System.out.println("출간년도 : " + this.year);
        System.out.println("---------------------");
    }
}
