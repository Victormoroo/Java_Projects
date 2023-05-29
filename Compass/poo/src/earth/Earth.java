package earth;

public class Earth {
  public static void main(String[] args) {
    Human human01 = new Human("Victor Moro", 20, 1.86, "brown");
    Human human02 = new Human("Jaqueline Santos", 37, 1.60, "green");

    human01.speak();
    human02.speak();
  }
}
