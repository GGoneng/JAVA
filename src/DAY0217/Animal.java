package src.DAY0217;

public class Animal {
    public String name;
    public float weight;
    public char gender;
    public int age;

    Animal() {
        this("unknown", 0.f, 'M', 0);
    }

    Animal(String name_, float weight_, char gender_, int age_) {
        name = name_;
        weight = weight_;
        gender = gender_;
        age = age_;
    }

    void bark(String sound) {
        System.out.println(sound);
    }

    void move(String direction) {
        System.out.println(name + " 이/가 " + direction + "으로 이동합니다.");
    } 

    void eat(String food) {
        System.out.println(name + " 이/가 " + food + "을/를 먹습니다.");
    }

    static void scratch(Cat c) {
        System.out.println(c.name + " 이/가 긁었다.");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Tiger tiger = new Tiger();
        Elephant elephant = new Elephant();
        Cat cat = new Cat();


        lion.bark("으르릉");
        penguin.move("북쪽");
        tiger.eat("고기");
        
        Animal.scratch(cat);
        

    }
}
