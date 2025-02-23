/*
 * 프로그램 진입점 즉, main() 메서드 포함한 클래스
 * 프로그램 구동 위해 사용되는 클래스
 */

package src.DAY0219;

public class EXAM {
    public static void main(String[] args) {
        char arr[] = {'A', 'B', 'C'};
        char arr2[] = new char[]{'h', 'e', 'l', 'l', 'o'};
        
        // char arr3[];
        // arr3 = {'A', 'B', 'C'}; // ERROR 선언과 동시에 초기화때만 가능

        for (char ch : arr) {
            System.out.println(ch);
        }

        for (char ch : arr2) {
            System.out.println(ch);
        }
    }
}
// - [실습1]
    // public static void main(String[] args) {
      // // 객체 / 인스턴스 생성
        // Variable v1 = new Variable();
        // Variable v2 = new Variable();


        // // 객체 / 인스턴스 속성
        // // default 접근 지정자 속성이라서 가능함
        // System.out.println("name : " + v1.name);
        // System.out.println("code : " + v1.code);

        // v1.code = 100;
        // v2.code = 2024;
        // Variable.code = 2025;

        // // 클래스로 속성 / 변수
        // System.out.println("code : " + Variable.code);
    // }
        

// - [실습2]
//     public static void main(String[] args) {
//         // 인스턴스 생성과 생성자
//         Variable v1 = new Variable();
//         Variable v2 = new Variable("H123", "Hong");
//         Variable v3 = new Variable("!@0000");

//         // 메서드 호출
//         // 클래스 메서드 : 인스턴스 생성 없이 실행 가능
//         Variable.hello();

//         // 인스턴스 메서드 : 인스턴스 생성 후 실행 가능
//         v1.printInfo();
//         v3.printInfo();

//         // 인스턴스 / 객체 변수명으로 클래스 메서드 호출
//         v2.hello();

//     }
// }

// - [실습3]    
//     public static void main(String[] args) {
//         // 대표적인 static 즉, 클래스 변수와 메서드로 구성된 클래스
//         System.out.println(Math.PI);
//         System.out.println(Math.round(4.56789));
//     }

// }

// - [실습4]
//     public static void main(String[] args) {
//         // 인스턴스 생성
//         Person lee = new Person();
//         Person park = new Person('M', 10, 162.4f);

//         // 인스턴스 메서드 호출
//         lee.eat("스파게티");
//         park.play("야구");
        
//         String msg = "OK";

//         // 블록 { } : 블록 내에서만 사용 가능한 Local Variable
//         {
//             String msg1 = "Happy";
//         }

//         System.out.println("MSG => " + msg);    // 블록 안의 변수 못씀
//     }
// }


// - [실습5]
//     public static void main(String[] args) {
//         // 클래스 속성 출력
//         for (int value : StaticBlock.arr) {
//             System.out.println(value);
//         }
//     }
// }