package zoo;

public class Fish extends Animal {
  
  public Fish(String name, int age, double weight, String sex) {
    super(name, age, weight, sex);
  }

  public void swim() {
    System.out.println("swimming...");
  }

  @Override
  public void move() {
    System.out.println("fish is swimming...");
  }
}
