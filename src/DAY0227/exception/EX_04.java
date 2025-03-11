package src.DAY0227.exception;

public class EX_04 {

    // ----------------------------------------------------
    // 메서드 설명 : 합계가 3의 배수가 되면 Exception 발생됨
    // ----------------------------------------------------
    public static void calcNums() throws Exception {
        // 합계가 3의 배수가 되면 예외 발생
        for(int num = 1, total = 0; ; num++) {
            total += num;
            if (total % 3 == 0) {
                throw new Exception("3의 배수 에러");
            }
        }        
    }

    // [3] 호출한 메서드의 Exception 처리하기
    public static void main(String[] args) {
        try {
            calcNums();
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
    // [1] 해당 메서드를 호출한 쪽으로 예외처리 넘기기 => throws Exception
    // public static void main(String[] args) throws Exception {
    //     // 강제 예외 발생 시키기
    //     throw new Exception("Custom EXCEPTION");
        
    // }
    
    
    // [2] 내가 예외 처리하기기
    // public static void main(String[] args) {
    //     try {
    //     // 강제 예외 발생 시키기
    //     throw new Exception("Custom EXCEPTION");
    //     } catch (Exception e) {
    //         System.out.println("내가 처리할게~" + e);
    //     }
    // }
}
