// -------------------------------------------
// FILE : FlyInterface.java
// DESC : 나는 행동 관련 메서드 정의한 인터페이스
// DATE : 2025-02-26
// -------------------------------------------

package src.DAY0226;

// -------------------------------------------
// NAME : FlyInterface
// METHOD : takeoff, landing
// -------------------------------------------

public interface FlyInterface {

    public abstract boolean takeoff(String where);
    public abstract void takeoff();

    public abstract boolean landing(String where);
    public abstract void landing();

    public abstract boolean fly(String where);
    public abstract void fly();

    public default void going() {
        System.out.println("... ing!!");
    }
}
