package java_basics;

public class MyUtils {
  
  public static void printSomeJunk(String argument) {
    System.out.println("bla bla bla " + argument);
  }

  public static void printSomeJunk(int argument) {
    System.out.println("Integer passed in: " + argument);
  }

  public static void sum2numbers(int num1, int num2) {
    System.out.println(num1 + num2);
  }

  public static int add10(int someArgument) {
    return someArgument + 10;
  }

  public static String newSomeJunk(String argument) {
    return "the past argument is: " + argument;
  }

  public int add20(int someArgument) {
    return someArgument + 20;
  }
}
