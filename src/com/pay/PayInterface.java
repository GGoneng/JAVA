package src.com.pay;

// ------------------------------------------
// NAME : PayInterface
// METHOD : pay, refund, cancel
// ------------------------------------------

public interface PayInterface {
    
    public abstract boolean pay(int amount);
    public abstract boolean refund(int amount);
    public abstract boolean cancel(int amount);
}
