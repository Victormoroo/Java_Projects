package zoo;

public class Chicken extends Bird {

  public Chicken(String name, int age, double weight, String sex) {
    super(name, age, weight, sex);
  }
  
  // uma galinha não voa, então para mudar oque o metodo fly() faz, voce teria que modificar o print nele, porem essa é a maneira errada de se fazer isso
  // public void fly() {
  //   System.out.println("can't fly...");
  // }
}
