package src.DAY0217;

public class Tiger extends Animal {
    Tiger() {
        this("unknown", 0.f, 'M', 0);
    }

    Tiger(String name_, float weight_, char gender_, int age_) {
        super(name_, weight_, gender_, age_);
    }

    @Override
    void bark(String sound) {
        System.out.println("[Tiger] " + sound);
    }

    @Override
    void move(String direction) {
        System.out.println("[Tiger] " + super.name + " 이/가 " + direction + "으로 이동합니다.");
    } 

    @Override
    void eat(String food) {
        System.out.println("[Tiger] " + super.name + " 이/가 " + food + "을/를 먹습니다.");
    }

}
