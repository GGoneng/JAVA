package src.DAY0219;

public class Product {

    static int count = 0;
    private int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product(){ }

    public int getSerialNo() { return this.serialNo; }
    
    public static void main(String[] args) {
        Product product = new Product();

        System.out.println(product.getSerialNo());
    }
}
