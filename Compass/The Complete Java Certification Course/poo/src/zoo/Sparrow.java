package zoo;

public class Sparrow extends Bird implements Flyble {

  public Sparrow(String name, int age, double weight, String sex) {
    super(name, age, weight, sex);
  }

  @Override
  public void fly() {
    System.out.println("flying...");
  }
  
}
