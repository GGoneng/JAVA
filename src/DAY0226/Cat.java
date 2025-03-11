package src.DAY0226;

public class Cat implements AnimalInterface {
   // 멤버 변수(Field/Attribute/Variable) ---------------------------------------------------------------
   private String color;
   private String eyecolor;
   private char gender;
   private String kind;
   private int age;
   
   // Constructor Method ------------------------------------------------------------------------------
   Cat() { }
   
   public Cat(String color, String eyecolor, char gender, String kind, int age) {
      this.color = color;
      this.eyecolor = eyecolor;
      this.gender = gender;
      this.kind = kind;
      this.age = age;
   }

   // Member Method ---------------------------------------------------------------------------------
   public void grooming(String where) {
      System.out.println(where + "그루밍하고 있다.");
   }
   
   // Override Method -------------------------------------------------------------------------------
   @Override
   public void eat() {
      System.out.println("밥을 먹는다.");
   }

   @Override
   public void eat(String food) {
      System.out.println(food+" 먹는다.");
      
   }

   @Override
   public void sleep() {
      System.out.println("잔다.");
   }

   @Override
   public void move() {
      System.out.println("사뿐사뿐 걸어간다.");
      
   }

}
