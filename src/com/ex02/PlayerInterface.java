package src.com.ex02;

// ---------------------------------------------
// NAME : PlayerInterface
// METHOD : play
//          pause
//          stop
// ---------------------------------------------

public interface PlayerInterface {
    
    // Abstract Method
    public abstract void play();
    public abstract void play(String filename);

    public abstract void pause();
    public abstract void stop();
}
