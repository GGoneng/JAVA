package src.DAY0217;

public class Tiger {
    String name;
    float weight;
    char gender;
    int age;

    Tiger(String name_, float weight_, char gender_, int age_) {
        name = name_;
        weight = weight_;
        gender = gender_;
        age = age_;
    }

    void bark() {
        System.out.println("으르릉");
    }

    void move(String direction) {
        System.out.println(name + " 이/가 " + direction + "으로 이동합니다.");
    } 

    void eat(String food) {
        System.out.println(name + " 이/가 " + food + "을/를 먹습니다.");
    }

}
