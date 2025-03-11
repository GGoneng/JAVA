package src.com.ex02;

public interface PhoneInterface {
    // Constant Field / Attribute / Variable
    final int TIMEOUT = 10000;             


    // Abstract Method
    void sendCall();                            
    void receiveCall();                     
    
    
    // Default Method
    default void printLogo() {             
        System.out.println("** Phone **");
    }
}
