/*
 * 클래스 역할 : 은행 업무 관리 프로그램 클래스
 * 클래스 이름 : BankManager
 * 클래스 필드 : -
 * 클래스 기능 : 프로그램 진입점 main
 *              => 전체 프로그램 제어 코드
 */

package src.DAY0227.Bank.app;

import src.DAY0227.Bank.kor.Msg;
import src.DAY0227.Bank.model.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
        // 은행 시스템 인스턴스 생성
        BankSystem myBK = new BankSystem("대구", "복현점");

        // 입력 인스턴스 생성
        Scanner scanner = new Scanner(System.in);



        // 은행 업무 시스템 루틴 
        BK_END:
            while(true) {
                // 서비스 메뉴 출력
                myBK.printMenu();
                try {
                    switch(scanner.nextInt()) {
                        case 1 :
                            myBK.createAccount(scanner);
                            break;
                        
                        case 2 :
                            if (myBK.listAccount() == false) { Msg.message(Msg.W_06); }
                            break;
                        
                        case 3 :
                            break;

                        case 4 : 
                            myBK.deposit(scanner);
                            break;
                        
                        case 5 :
                            myBK.withdraw(scanner);
                            break;

                        case 6 :
                            Msg.message(Msg.W_03);
                            break BK_END;

                        default : 
                            Msg.message(Msg.W_02);
                            break;
                    }
                    
                } catch(InputMismatchException ie) {
                    Msg.message(Msg.W_01);
                    scanner.nextLine();   // 입력 데이터 비우기
        
                } catch(Exception e) {
                    Msg.message(Msg.W_04);
                }
        }
        System.out.println("프로그램이 종료됩니다. \n좋은 하루 되세요.");
    }
}

