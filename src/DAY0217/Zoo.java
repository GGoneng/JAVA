package src.DAY0217;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat("꼬냉", 10.f, 'M', 14);
        Elephant elephant = new Elephant("코끼리", 175.f, 'F', 12);
        Lion lion = new Lion("사자", 123.f, 'M', 7);
        Penguin penguin = new Penguin("펭귄", 30.f, 'F', 12);
        Tiger tiger = new Tiger("호랑이", 111.4f, 'F', 3);

        cat.bark();
        cat.move("북쪽");
        cat.eat("고기");
        
        elephant.bark();
        elephant.move("서쪽");
        elephant.eat("풀");

        lion.bark();
        lion.move("동쪽");
        lion.eat("소고기");

        penguin.bark();
        penguin.move("남쪽");
        penguin.eat("생선");

        tiger.bark();
        tiger.move("집");
        tiger.eat("돼지고기");
    }
}
