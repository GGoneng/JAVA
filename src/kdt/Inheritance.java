package src.kdt;

public class Inheritance {
    public static void main(String[] args) {
        // 10명의 학생 정보 저장 ----------------
        Student arrStd[] = new Student[3];

        arrStd[0] = new Student("홍", "대구중", 14);
        arrStd[1] = new Student("박", "오성중", 16);
        arrStd[2] = new Student("이", "대구고", 19);
        
        // 문자열 배열 --------------------------
        String arrMsg[] = new String[10];
        arrMsg[0] = "Good";     // 컴파일러가 new String("Good");
        arrMsg[1] = "Happy";    // 컴파일러가 new String("Happy");
        arrMsg[2] = new String("OK");
    }    
}
