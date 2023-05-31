package zoo;

public class Zoo {
  public static void main(String[] args) {
    // Animal animal01 = new Animal("Cacau", 5, 10.5, "female");
    // Fish animal02 = new Fish("Dino", 7, 100, "female");
    // Bird animal03 = new Bird("Kiko", 1, 0.6, "male");
    // Sparrow animal04 = new Sparrow("Quitin", 2, 0.4, "female");

    // animal01.characteristics();
    // animal01.eat();
    // animal01.walk();
    // System.out.println("-----------------");
    // animal02.characteristics();
    // animal02.swim();
    // System.out.println("-----------------");
    // animal03.characteristics();
    // animal03.sleep();
    // System.out.println("-----------------");
    // animal04.fly();

  // ###################################################################################################################

    Animal sparrow01 = new Sparrow("Kiko", 2, 0.7, "male");
    // sparrow01.move();

    Animal fish01 = new Fish("Cesar", 3, 4, "female");
    // fish01.move();

    moveAnimal(fish01);
    moveAnimal(sparrow01);
  }

  public static void moveAnimal(Animal animal) {
    animal.move();
  }

  // ###################################################################################################################
}
