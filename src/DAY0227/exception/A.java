package src.DAY0227.exception;

public class A {
    public static void main(String[] args) {
        // 100개의 문자열 주소 저장 공간 확보
        String customArr[] = new String[100];

        for(String custom : customArr) {
            System.out.println(customArr.length + "개");
            System.out.println(custom);
        }
    }
}
