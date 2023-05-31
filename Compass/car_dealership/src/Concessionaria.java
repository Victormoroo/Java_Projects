public class Concessionaria {
  public static void main(String[] args) {
    
    Cliente cliente01 = new Cliente("Cocao", "Rua Carlos de Vilhena, 4424", 15000);

    Veiculo veiculo = new Veiculo("Nissan", "GTR R35", "Blue", 20000);

    Funcionario func = new Funcionario();

    cliente01.compraCarro(veiculo, func, false);

  }
}