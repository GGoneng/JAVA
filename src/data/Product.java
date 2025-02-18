package src.data;

/*
 * 클래스 역할 : 판매 제품 정보 저장
 * 클래스 이름 : Product
 * 클래스 속성 : 제품코드, 제품명, 단가, 수량
 * 클래스 기능 : 제품정보 출력 기능
 *              제품코드에 따른 가격 안내 기능
 *              제품코드에 따른 수량 안내 기능
 */

public class Product {
    // --------------------------------------
    // 멤버 속성 (변수)
    // --------------------------------------

    private String code; // 제품코드
    private String pname; // 제품명
    private int price; // 단가
    private int count; // 수량

    // --------------------------------------
    // 생성자 메서드 오버로딩
    // --------------------------------------

    public Product() {
        this("Unknown", "Unknown", 0, 0);
    }

    public Product(String code, String pname) {
        this(code, pname, 0, 0);
    }

    public Product(String code, String pname, int price) {
        this(code, pname, price, 0);
    }

    public Product(String code, String pname, int price, int count) {
        this.code = code;
        this.pname = pname;
        this.price = price;
        this.count = count;
    }

    // --------------------------------------
    // getter / setter 메서드
    // --------------------------------------

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.pname;
    }

    public int getPrice() {
        return this.price;
    }

    public int getCount() {
        return this.count;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }
    

    // ----------------------------------------------
    // 인스턴스 메서드 : 객체 생성 후 사용 가능 메서드
    // ----------------------------------------------

    // 제품정보 출력 기능
    // * 제품코드에 따른 가격 안내 기능
    // * 제품코드에 따른 수량 안내 기능

    /*
     * 메서드 기능 : 제품 정보 출력 기능
     * 메서드 이름 : showInfo()
     * 매개 변수들 : -
     * 메서드 결과 : void
     * 접근 지정자 : public
     */

    public void showInfo() {
        System.out.println("--------------------");
        System.out.println("[" + this.code + "]");
        System.out.println("--------------------");
        System.out.println("제품명 : " + this.pname);
        System.out.println("수량 : " + this.count);
        System.out.println("가격 : " + this.price);
        System.out.println("--------------------");
    }

    /*
     * 메서드 기능 : 제품코드에 따른 가격 안내 기능
     * 메서드 이름 : searchPrice()
     * 매개 변수들 : String code
     * 메서드 결과 : int
     * 접근 지정자 : public
     */
    public int searchPrice(String code) {
        return this.price;
    }

    /*
     * 메서드 기능 : 제품코드에 따른 수량 안내 기능
     * 메서드 이름 : searchCount()
     * 매개 변수들 : String code
     * 메서드 결과 : int
     * 접근 지정자 : public
     */
    int searchCount(String code) {
        return this.count;
    }
}
