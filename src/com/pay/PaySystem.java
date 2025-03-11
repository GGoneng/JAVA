
package src.com.pay;

import java.util.Scanner;


/*
 * 결제 시스템 구현
 * - 사용자로부터 결제 방식 선택 받기
 * - 선택 방식에 따른 결제 진행
 */

public class PaySystem {
    // Class Member Field / Attribute / Variable -----------
    final static int CARD = 1;
    final static int PAY = 2;
    final static int ETC = 3;

    
    // Class / Static Method -------------------------------
    // 메서드 기능 : 사용자로부터 결제 방식 선택 받은 후 반환
    // 메서드 이름 : selectPayType
    // 매개 변수들 : void
    // 메서드 결과 : 카드(1), 페이(2), 나머지(3)에 대한 정수 값 int
    // -----------------------------------------------------
    public static int selectPayType() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("결제 방식 선택");
        System.out.println("1. 신용카드");
        System.out.println("2. 페    이");
        System.out.println("3. 없    음");
        System.out.print("입력 : ");

        int type = scanner.nextInt();

        scanner.close();

        return type;
    }

    
    // -----------------------------------------------------
    // 메서드 기능 : 선택 방식에 따른 결제 진행
    // 메서드 이름 : payProcess
    // 매개 변수들 : PayInterface p, int amount
    // 메서드 결과 : 결제 여부 boolean
    // -----------------------------------------------------

    public static boolean payProcess(PayInterface p, int amount) {
        return p.pay(amount);
    }


    // Entry Point Method ----------------------------------
    public static void main(String[] args) {
        // 결제 방식 선택
        int payType = PaySystem.selectPayType();

        // 결제 진행
        switch(payType) {
            case PaySystem.CARD:
            // PayInterface 타입 <==== CreditCard 인스턴스 전달 가능 OK 이유 : PayInterface implements 하고 있음
            CreditCard card = new CreditCard("삼성", "보너스 카드", "1111", "301101", 1000);
                PaySystem.payProcess(card, 280);
                break;

            case PaySystem.PAY:  
                NPay npay = new NPay("GSPay");
                // PayInterface 타입 <==== NPay 인스턴스 전달 가능 OK 이유 : PayInterface implements 하고 있음
                PaySystem.payProcess(npay, 300);
                break;
            
            default:
                System.out.println("결제 불가합니다."); 
                break; 
        }
     
        System.out.println("END");
    }
}
