package zoo;

public abstract class Animal {
  String name;
  int age;
  double weight;
  String sex;

  public Animal(String name, int age, double weight, String sex) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.sex = sex;
  }

  public void characteristics() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age + " years");
    System.out.println("Weight: " + weight + " kg");
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

  public abstract void move();
}
