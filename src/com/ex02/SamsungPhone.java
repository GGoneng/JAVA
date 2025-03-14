package src.com.ex02;

public class SamsungPhone implements PhoneInterface {
    
    // PhoneInterface's Override Method ----------------------------------
    @Override
    public void sendCall() { System.out.println("띠리리리링"); }


    @Override
    public void receiveCall() { System.out.println("전화가 왔습니다."); }


    @Override
    public void printLogo() {
        System.out.println(" SAMSUNG ");
    }
    
    // Custom Member Method -----------------------------------------------
    public void flash() { System.out.println("전화기에 불이 켜졌습니다."); }

    public void blinking() {
        System.out.println("★★★ ★★★ ★★★");
    }
}
