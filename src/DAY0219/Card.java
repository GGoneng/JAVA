package src.DAY0219;

public class Card {
    
    // -----------------------------
    // 클래스 변수
    // -----------------------------

    static String cardArr[] = new String[54];
    static char marks[] = {'♣', '♠', '♥', '◆'};
    static int num;

    // ----------------------------
    // 초기화 블록
    // ----------------------------

    {
        for (int idx = 0; idx < 4; idx++) {
            for (num = 1; num <= 13; num++) {
                cardArr[(num - 1) + (13 * idx)] = "" + marks[idx] + " " + num;
            }
        }
    }

    // ----------------------------
    // 클래스 메서드
    // ----------------------------

    static void printcardArr() {
        for (int idx = 0; idx < cardArr.length; idx++) {
            System.out.println(cardArr[idx]);
        }
    }

}
