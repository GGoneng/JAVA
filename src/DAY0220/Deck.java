/*
 * 클래스 역할 : 카드 게임
 * 클래스 이름 : Deck
 * 클래스 속성 : 카드 52장
 * 클래스 기능 : 카드 섞기, 카드 꺼내기기
 */

package src.DAY0220;

public class Deck {
    // -----------------------------
    // 멤버 변수
    // -----------------------------
    // 클래스 변수
    public static final int D_SIZE = 52; // 모든 인스턴스에서 공유, 변경 불가함함
    
    // 인스턴스 변수
    private Card arrCard[] = new Card[52];
    private int pickNum = -1;

    // -----------------------------
    // 생성자 메서드
    // -----------------------------

    Deck() {
        // 52장 카드 인스턴스 생성 후 저장
        char kindArr[] = {Card.CLOVER, Card.DIAMOND, Card.SPACE, Card.HEART};
        // for (char kind : kindArr) 
        for (int k_num = 0; k_num < kindArr.length; k_num++)
        {
            for (int num = 0; num < Card.NUM_MAX; num++) {
                arrCard[k_num * Card.NUM_MAX + num] = new Card(num + 1, kindArr[k_num]);
            }
        }

        // for (Card cd : arrCard) {
        //     cd.printInfo();
        // }
    }

    // -----------------------------
    // Getter / Setter 메서드
    // -----------------------------

    public Card[] getArrCard() {return this.arrCard;}



    // -----------------------------
    // 멤버 메서드
    // -----------------------------
    // 메서드 기능 : 카드 섞기
    // 메서드 이름 : shuffle
    // 매개 변수들 : - 
    // 메서드 결과 : void
    // -----------------------------

    public void shuffle() {

        
        for (int idx = 0; idx < Deck.D_SIZE; idx++) {
            int cIdx = (int)(Math.random() * Deck.D_SIZE);

            // idx번째 요소 값 백업
            Card temp = this.arrCard[idx];

            // idx 번째 요소에 cIdx 번째 값 넣기
            this.arrCard[idx] = this.arrCard[cIdx];

            // cIdx 번째 요소에 백업 데이터 넣기
            this.arrCard[cIdx] = temp;
        }
    }

    // -----------------------------
    // 메서드 기능 : 카드 뽑기
    // 메서드 이름 : pickup
    // 매개 변수들 : - 
    // 메서드 결과 : Card
    // -----------------------------

    public Card pickup() {
        
        this.pickNum++;
        return this.arrCard[this.pickNum];
    }

    // -----------------------------
    // 메서드 기능 : 카드 확인
    // 메서드 이름 : checkCard
    // 매개 변수들 : - 
    // 메서드 결과 : void
    // -----------------------------

    public void checkCard() {
        // 카드 확인
        for(Card card : this.arrCard) card.printInfo();
    }


    // -----------------------------
    // 프로그램 시작 메서드
    // -----------------------------

    public static void main(String[] args) {
        Deck myDeck = new Deck();

        // 카드 확인
        myDeck.shuffle();

        for (int cnt = 0; cnt < 5; cnt++) {
            Card choiceCard = myDeck.pickup();
            System.out.print("뽑은 카드 => ");
            choiceCard.printInfo();
        }
    }
}
