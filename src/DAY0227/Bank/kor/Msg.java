package src.DAY0227.Bank.kor;

public class Msg {
    public static final String W_01 = "정수만 입력 가능 합니다.";
    public static final String W_02 = "서비스 선택이 잘못 되었습니다.";
    public static final String W_03 = "서비스 종료합니다.";
    public static final String W_04 = "예상 못한 문제가 발생했습니다.";
    public static final String W_05 = "프로그램 종료됩니다.\n좋은 하루 되세요";
    public static final String W_06 = "등록된 계좌가 없습니다.";

    public static final String E_01 = "강제종료됩니다.";

    public static void message(String msg) {
        System.out.println(msg);
    }
}
