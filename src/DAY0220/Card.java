package src.DAY0220;

public class Card {
    // ---------------------------------
    // 멤버 변수
    // ---------------------------------

    // - 클래스 변수
    static final int KIND_NUM = 4; // 카드 무늬 종류 수
    static final int NUM_MAX = 13; // 무늬별 카드 갯수

    // static final int DIAMOND = 1; // 카드 무늬 값
    // static final int HEART = 2;
    // static final int SPACE = 3;
    // static final int CLOVER = 4;

    static final char DIAMOND = '◆';
    static final char HEART = '♥';
    static final char SPACE = '♠';
    static final char CLOVER = '♠';


    // - 인스턴스 변수
    private int number;
    private char kind;

    // ---------------------------------
    // 생성자 메서드
    // ---------------------------------
    Card() {
        this(1, DIAMOND);
    }
    
    Card(int number, char kind) {
        this.number = number;
        this.kind = kind;
    }

    // ---------------------------------
    // 멤버 메서드
    // ---------------------------------

    // 메서드 기능 : 카드 정보 출력
    // 메서드 이름 : printInfo
    // 매개 변수들 : -
    // 메서드 결과 : void
    
    public String printInfo() {
        System.out.println("종류 : " + this.kind + " 번호 : " + this.number);
        return this.kind + "," + this.number;
    
    }
}


