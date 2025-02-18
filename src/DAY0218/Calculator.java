package src.DAY0218;

public class Calculator {

    private String name;
    private String history;
    private float total;

    public Calculator() {
        this("Null", "0", 0.f);
        System.out.println("=======================");
        System.out.println("   " + this.name + "님의 계산기");
        System.out.println("=======================\n");
    }    

    public Calculator(String name) {
        this.name = name;
        this.history = "0";
        this.total = 0.f;
        System.out.println("=======================");
        System.out.println("   " + this.name + "님의 계산기");
        System.out.println("=======================\n");
    }

    public Calculator(String name, String history, float total) {
        this.name = name;
        this.history = "0";
        this.total = 0.f;
    }

    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return this.history;
    }

    public float getTotal() {
        return this.total;
    }


    public void Plus(float a) {
        this.history = this.total + " + " + a + " = " + (this.total + a);
        this.total += a;
        System.out.println(this.history);
    }

    public void Minus(float a) {
        this.history = this.total + " - " + a + " = " + (this.total - a);
        this.total -= a;
        System.out.println(this.history);
    }

    public void Multiply(float a) {
        this.history = this.total + " * " + a + " = " + (this.total * a);
        this.total *= a;
        System.out.println(this.history);
    }

    public void Divide(float a) {
        this.history = this.total + " % " + a + " = " + (this.total / a);
        this.total /= a;
        System.out.println(this.history);
    }

    public void clearHistory() {
        this.history = "0";
        System.out.println(this.history);
    }
}
