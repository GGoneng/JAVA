/*
 * 클래스 역할 : 도서 정보 저장
 * 클래스 이름 : Book
 * 클래스 속성 : 제목, 저자, 출간년도
 * 클래스 기능 : 도서 정보 출력
 */

package src.DAY0218;

public class Book {
    // ------------------------------------
    // - 멤버 속성
    // ------------------------------------
    String       title;   // 제목
    String       author;  // 저자
    int          year;     // 출간년도


    // ------------------------------------
    // - 생성자 메서드
    // ------------------------------------
    // Default 생성자 : 매개 변수 X

    Book() {
        // this.title = "unknown";
        // this.author = "unknown";
        // this.year = 0;
    
        this("unknown", "unknown", 0);
    }


    // 제목, 저자만 초기화 생성자
    Book(String title, String author) {
    //  this.title = title;
    //  this.author = author;
        this(title, author, 0);    
    }


    // 속성 모두 초기화 생성자
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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
