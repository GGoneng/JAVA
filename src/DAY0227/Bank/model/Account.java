/*
 * 클래스 역할 : 계좌 정보 저장 클래스
 * 클래스 이름 : Account
 * 클래스 필드 : 계좌번호
 *              예금주
 *              잔액
 *              만든날짜
 *              만든지점
 * 클래스 기능 : 계좌 정보 출력
 */

package src.DAY0227.Bank.model;

import java.lang.reflect.Array;

public class Account {
    // -------------------------------------------
    // Member Field / Attribute / Variable
    // -------------------------------------------
    private String accNumber;       // 계좌번호
    private String owner;           // 예금주
    private int balance;            // 잔액
    private String createDT;        // 만든날짜
    private String createLO;         // 만든지점

    // -------------------------------------------
    // Constructor Method
    // -------------------------------------------
    public Account() { }

    public Account(String accNumber, String owner, int balance, String createDT, String createLO) {
        this.accNumber = accNumber;
        this.owner = owner;
        this.balance = balance;
        this.createDT = createDT;
        this.createLO = createLO;
    }

    // -------------------------------------------
    // Getter / Setter Method
    // -------------------------------------------

    public String getAccNumber() {
        return this.accNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    } 

    public String getCreateDT() {
        return this.createDT;
    }

    public String getCreateLO() {
        return this.createLO;
    }


    // -------------------------------------------
    // Member Method
    // -------------------------------------------

    // -------------------------------------------
    // 메서드 역할 : 계좌 정보 화면 출력
    // 메서드 이름 : printInfo
    // 매개 변수들 : 계좌번호
    // 메서드 결과 : void
    // -------------------------------------------
    public void printInfo(String accNumber, Array accArray[]) {
        System.out.println("-------------------------------");
        System.out.println("* 계좌번호 : " + this.accNumber);
        System.out.println("* 예금주명 : " + this.owner);
        System.out.println("* 잔    액 : " + this.balance);
        System.out.println("* 개설일자 : " + this.createDT);
        System.out.println("* 개설지점 : " + this.createLO);
        System.out.println("-------------------------------");
    }


    // -------------------------------------------
    // 메서드 역할 : 계좌 정보 화면 출력
    // 메서드 이름 : printInfo
    // 매개 변수들 : -
    // 메서드 결과 : void
    // -------------------------------------------
    public void printInfo() {
        System.out.println("-------------------------------");
        System.out.println("* 계좌번호 : " + this.accNumber);
        System.out.println("* 예금주명 : " + this.owner);
        System.out.println("* 잔    액 : " + this.balance);
        System.out.println("* 개설일자 : " + this.createDT);
        System.out.println("* 개설지점 : " + this.createLO);
        System.out.println("-------------------------------");
        
    }
}

