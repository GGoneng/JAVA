/*
 * 프로그램 제어 및 컨트롤 클래스
 * - 프로그램 진입점 Entry Point main() 메서드 존재
 */

package src.DAY0218;

import src.data.Product;

public class EXAM {
    public static void main(String[] args) {
        // 제품 인스턴스 생성
        Product p1 = new Product();

        // 메서드 호출
        p1.showInfo();

        System.out.println(p1.searchPrice("P001"));
    //  System.out.println(p1.searchCount("P001"));
    //  접근 지정자 default이기 때문에 접근 불가
    }
}
