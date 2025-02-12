package src.DAY0212;

public class EX_FOR_02 {
    public static void main(String[] args) {
        // 10 ~ 100까지 10단위로 출력 => 10 20 30 ~ 100
        for (int idx = 10; idx < 101; idx += 10) {
            System.out.println(idx);
        }

        // 10, 9, 8, ..., 1까지 다운카운팅 출력
        for (int idx = 10; idx > 0; idx--) {
            System.out.println(idx);
        }
    }
}
