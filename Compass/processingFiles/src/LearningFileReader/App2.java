package LearningFileReader;

class MyClass implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("Closing!");
  }

}

public class App2 {
  public static void main(String[] args) {
    
    try (MyClass var = new MyClass();) {

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
