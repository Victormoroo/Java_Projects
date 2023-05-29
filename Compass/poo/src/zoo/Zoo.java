package zoo;

public class Zoo {
  public static void main(String[] args) {
    Animal animal01 = new Animal("Cacau", 5, 10.5, "mammal", "female");
    Animal animal02 = new Animal("Dino", 7, 200, "reptile", "female");
    Animal animal03 = new Animal("Kiko", 3, 0.6, "bird", "male");

    animal01.characteristics();
    animal01.eat();
    animal01.walk();
    System.out.println("-----------------");
    animal02.characteristics();
    animal02.sleep();
    animal01.walk();
    System.out.println("-----------------");
    animal03.characteristics();
    animal03.fly();
    animal03.sleep();
  }
}
