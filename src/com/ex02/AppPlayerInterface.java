package src.com.ex02;

/*
 * 전화 걸기 / 받기           <- sendCall(), receiveCall()    : PhoneInterface
 * 문자 보내기 / 받기         <- sendSMS(), receiveSMS()      : MobilePhoneInterface
 * 음악 재생 / 일시정지 / 정지 <- play(), pause(), stop()      : PlayerInterface
 * 음성 인식  voiceRec()
 */

public interface AppPlayerInterface extends PlayerInterface, MobilePhoneInterface {
    // Abstract Method
    void voiceRec();
}
