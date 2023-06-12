package practice_loops;

public class LoopFor {
  public static void main(String[] args) {
    
    String name = "Victor";
  
    for (int i = 0; i <= name.length() - 1; i++) {
      System.out.println("char: " + name.charAt(i));
    }

    System.out.println("----------------");

    for (int i = name.length() - 1; i >= 0; i--) {
      System.out.println("char: " + name.charAt(i));
    }

    System.out.println("----------------");

    for (int i = 0; i <= 100; i += 2) {
      System.out.println("number: " + i);
    }
  }
}
