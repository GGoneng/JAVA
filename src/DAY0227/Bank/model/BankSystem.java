/*
 * 클래스 역할 : 은행 업무 관리 클래스
 * 클래스 이름 : BankSystem
 * 클래스 필드 : 은행명    => String
 *              지점명    => String
 *              계좌 목록 => Account의 배열 100개 짜리
 *              계좌 번호 생성 시 사용될 접두어 String 'BK-'
 *              개설 계좌 갯수 => int regCnt
 * 클래스 기능 : 서비스_화면_출력기능
 *              계좌개설기능
 *              계좌조회기능
 *              계좌입금기능
 *              계좌출금기능
 */

package src.DAY0227.Bank.model;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class BankSystem {
    
    // -------------------------------------------
    // Member Field / Attribute / Variable
    // -------------------------------------------
    private final String BNAME;
    private final String LNAME;
    // private Account accountArr[] = new Account[100];

    private ArrayList<Account> accountArr = new ArrayList<Account>();
    private int regCnt;
    private final String prefix = "777-";

    // -------------------------------------------
    // Constructor Method
    // -------------------------------------------
    public BankSystem() { this("BANK", "NONE"); }

    public BankSystem(String bNAME, String lNAME) {
        BNAME = bNAME;
        LNAME = lNAME;
    }

    // -------------------------------------------
    // Getter / Setter Method
    // -------------------------------------------

    public String getBNAME() { return this.BNAME; }
    public String getLNAME() { return this.LNAME; }
    public Account[] getAccountArr() { return this.accountArr; }
    public int getRegCnt() { return this.regCnt; }
    public String getPrefix() { return this.prefix; }

    // -------------------------------------------
    // Member Method
    // -------------------------------------------
    // 메서드 역할 : 서비스 화면 출력 기능
    // 메서드 이름 : printMenu
    // 매개 변수들 : -
    // 메서드 결과 : void
    // -------------------------------------------
    public void printMenu() {
        System.out.println("**********************");
        System.out.println("***** 서비스 선택 *****");
        System.out.println("**********************");
        System.out.println("*     1. 계좌개설     *" );
        System.out.println("*     2. 계좌목록     *" );
        System.out.println("*     3. 조    회     *" );
        System.out.println("*     4. 입    금     *" );
        System.out.println("*     5. 출    금     *" );
        System.out.println("*     6. 종    료     *" );
        System.out.println("**********************");
        System.out.print("선택 : ");
        
    }

    // --------------------------------------------
    // 메서드 역할 : 계좌 개설 기능
    // 메서드 이름 : createAccount
    // 매개 변수들 : String owner, int amount
    // 메서드 결과 : boolean
    // --------------------------------------------

    public boolean createAccount(String owner, int amount) {
        // String accNumber, String owner, int balance, String createDT, String createLO
        // - 계좌 번호 생성 : 777-001
        String accNumber = this.prefix + ++regCnt;

        // - 개설 날짜
        String createDT = "" + LocalDate.now();

        accountArr[this.regCnt++] = new Account(accNumber, owner, amount, createDT, this.LNAME);

        return true;
    }
    
    public boolean createAccount(Scanner scanner) {
        // String accNumber, String owner, int balance, String createDT, String createLO
        // - 계좌 번호 생성 : 777-001
        String accNumber = this.prefix + regCnt;

        // - 개설 날짜
        String createDT = "" + LocalDate.now();

        System.out.print("예금주 : ");
        String owner = scanner.next();

        System.out.print("예금액 : ");
        int amount = scanner.nextInt();

        accountArr[this.regCnt++] = new Account(accNumber, owner, amount, createDT, this.LNAME);

        return true;
    }

    // -----------------------------------------
    // 메서드 역할 : 계좌 목록 기능
    // 메서드 이름 : listAccount
    // 매개 변수들 : -
    // 메서드 결과 : boolean
    // -----------------------------------------

    public boolean listAccount() { 
        for (int idx = 0; idx < this.regCnt; idx++) {
            this.accountArr[idx].printInfo();
        }

        return (this.regCnt > 0) ? true : false;
    }

    // -----------------------------------------
    // 메서드 역할 : 입금 기능
    // 메서드 이름 : deposit
    // 매개 변수들 : -
    // 메서드 결과 : void
    // -----------------------------------------
    public void deposit(Scanner scanner) {
        // - 계좌번호
        System.out.print("계좌번호 : ");
        String accNumber = scanner.next();

        // - 입금액
        System.out.print("입금액 : ");
        int amount = scanner.nextInt();

        // - 해당 계좌에 입금
        for (int idx = 0; idx < this.regCnt; idx++) {
            if (this.accountArr[idx].getAccNumber().equals(accNumber) == true) {
                this.accountArr[idx].setBalance(this.accountArr[idx].getBalance() + amount);
                break;
            }
        }
    }


    // -----------------------------------------
    // 메서드 역할 : 출금 기능
    // 메서드 이름 : withdraw
    // 매개 변수들 : -
    // 메서드 결과 : void
    // -----------------------------------------
    public void withdraw(Scanner scanner) {
        // - 계좌번호
        System.out.print("계좌번호 : ");
        String accNumber = scanner.next();

        // - 출금액
        System.out.print("출금액 : ");
        int amount = scanner.nextInt();

        // - 해당 계좌에서서 출금
        for (int idx = 0; idx < this.regCnt; idx++) {
            if (this.accountArr[idx].getAccNumber().equals(accNumber) == true) {
                if (this.accountArr[idx].getBalance() >= amount) {
                    this.accountArr[idx].setBalance(this.accountArr[idx].getBalance() - amount);
                }
                else {
                    System.out.println("잔액이 부족합니다.");
                }
                break;
            }
        }
    }
}
