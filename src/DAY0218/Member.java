/*
 * 클래스 역할 : 회원 정보 클래스
 * 클래스 속성 : id, pw, name, age, phone, gender, job, address
 * 클래스 행동 : 회원 정보 출력 기능
 */

package src.DAY0218;

public class Member {
    
    // 멤버 속성
    String      id;
    String      pw;
    String      name;
    int         age;
    String      phone;
    char        gender;
    String      job;
    String      address;

    // 생성자 메서드
    Member () {
        // 속성명 = 저장할 값;
        id = "UnKnown";
        pw = "UnKnown";
        name = "UnKnown";
        age = 0;
        phone = "UnKnown";
        gender = 'N';
        job = "UnKnown";
        address = "UnKnown";
        }

    Member (String id_, String pw_) {
        // 속성명 = 저장할 값;
        id = id_;
        pw = pw_;
    }

    Member (String id_, String pw_, String name_, int age_) {
        // 속성명 = 저장할 값;
        id = id_;
        pw = pw_;
        name = name_;
        age = age_;
    }

    Member (String id_, String pw_, String name_, int age_, String phone_, char gender_,
            String job_, String address_) {
        // 속성명 = 저장할 값;
        id = id_;
        pw = pw_;
        name = name_;
        age = age_;
        phone = phone_;
        gender = gender_;
        job = job_;
        address = address_;
    }

    // 멤버 / 인스턴스 메서드
    // ------------------------------------------
    // 메서드 이름 : showInfo
    // 매개 변수들 :    - 
    // 메서드 결과 :   void 
    // ------------------------------------------
    void showInfo() {
        System.out.println("===============");
        System.out.println("id : " + id);
        System.out.println("pw : " + pw);
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
        System.out.println("===============");
    }
}
