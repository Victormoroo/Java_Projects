package zoo;

public class Animal {
  String name;
  int age;
  double weight;
  String type;
  String sex;

  public Animal(String name, int age, double weight, String type, String sex) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.type = type;
    this.sex = sex;
  }

  public void characteristics() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age + " years");
    System.out.println("Weight: " + weight + " kg");
    System.out.println("Type: " + type);
    System.out.println("Sex: " + sex);
  }

  public void eat() {
    System.out.println("eating...");
  }

  public void walk() { //andar
    System.out.println("walking...");
  }

  public void sleep() {
    System.out.println("sleeping...");
  }

  public void fly() {
    System.out.println("flying...");
  }
}
