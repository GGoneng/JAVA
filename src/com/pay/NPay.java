package src.com.pay;

public class NPay implements PayInterface {
    // Member Field / Attribute / Variable ------------------
    private String name;


    // Constructor Method -----------------------------------
    public NPay() { }
    public NPay(String name) {
        this.name = name;
    }

    
    // PayInterface's Override Method -----------------------
    @Override
    public boolean pay(int amount) {
        // [GSPay] 3000원 결제
        System.out.println("[" + this.name + "]" + amount + "원 결제 되었습니다.");
        return true;
    }


    @Override
    public boolean cancel(int amount) {
        System.out.println("[" + this.name + "]" + amount + "원 결제 취소");
        return false;
    }


    @Override
    public boolean refund(int amount) {
        System.out.println("[" + this.name + "]" + amount + "원 환불 되었습니다.");
        return false;
    }
}
