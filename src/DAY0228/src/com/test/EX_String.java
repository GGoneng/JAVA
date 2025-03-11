package src.DAY0228.src.com.test;

public class EX_String {
    public static void main(String[] args) {
        String msg = "Happy 2025 !!";

        // 문자열 메서드들 - 구성 문자 갯수 반환
        System.out.printf("%s => length() : %d개\n", msg, msg.length());

        // 문자열 메서드들 - 특정 인덱스 문자 추출
        System.out.printf("%s => charAt(0) : %c\n", msg, msg.charAt(0));

        int lastIdx = msg.length() - 1;
        System.out.printf("%s => charAt(%d) : %c\n", msg, lastIdx, msg.charAt(lastIdx));
        
        System.out.printf("%s => charAt(2) : %c\n", msg, msg.charAt(2));
        System.out.printf("%s => lastIndexOf('p') : %d\n", msg, msg.lastIndexOf('p'));

        // 문자열 메서드들 - 특정 문자로 문자열 분리
        String arr[] = msg.split("\s");
        for(String a : arr) {
            System.out.println(a);
        }
        
    }
}
