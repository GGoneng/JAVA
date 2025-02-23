package src.DAY0217;

public class Elephant extends Animal {
    Elephant() {
        this("unknown", 0.f, 'M', 0);
    }

    Elephant(String name_, float weight_, char gender_, int age_) {
        super(name_, weight_, gender_, age_);
    }

    @Override
    void bark(String sound) {
        System.out.println("[Elephant] " + sound);
    }

    @Override
    void move(String direction) {
        System.out.println("[Elephant] " + super.name + " 이/가 " + direction + "으로 이동합니다.");
    } 

    @Override
    void eat(String food) {
        System.out.println("[Elephant] " + super.name + " 이/가 " + food + "을/를 먹습니다.");
    }

 }
