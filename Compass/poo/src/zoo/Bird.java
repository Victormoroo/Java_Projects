package zoo;

public class Bird extends Animal {

  public Bird(String name, int age, double weight, String sex) {
    super(name, age, weight, sex);
  }

  @Override
  public void move() {
    System.out.println("Flapping wings...");
  }

  // public void fly() {
  //   System.out.println("flying...");
  // }
}
