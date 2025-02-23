package src.DAY0217;

public class Penguin extends Animal {
    Penguin() {
        this("unknown", 0.f, 'M', 0);
    }

    Penguin(String name_, float weight_, char gender_, int age_) {
        super(name_, weight_, gender_, age_);
    }

    @Override
    void bark(String sound) {
        System.out.println("[Penguin] " + sound);
    }

    @Override
    void move(String direction) {
        System.out.println("[Penguin] " + super.name + " 이/가 " + direction + "으로 이동합니다.");
    } 

    @Override
    void eat(String food) {
        System.out.println("[Penguin] " + super.name + " 이/가 " + food + "을/를 먹습니다.");
    }

}
