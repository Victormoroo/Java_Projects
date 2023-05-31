public class Funcionario {

  public void lidarCliente(Cliente cliente, boolean financas, Veiculo veiculo) {
    if(financas == true) {
      double montanteEmprestimo = veiculo.getValor() - cliente.getDinheiro();
      historicoCredito(cliente, montanteEmprestimo);
    } else if(veiculo.getValor() <= cliente.getDinheiro()) {
      processoTransacao(cliente, veiculo);
    } else {
      System.out.println("Cliente não possui montante suficiente para comprar o veículo " + veiculo);
    }
  }

  public void historicoCredito(Cliente cliente, double montanteEmprestimo) {
    System.out.println("Histórico de crédito do cliente foi executado!...");
    System.out.println("Cliente foi aprovado para a compra do veículo!");
  }

  public void processoTransacao(Cliente cliente, Veiculo veiculo) {
    System.out.println("Cliente comprou o veículo " + veiculo + " pelo valor de " + veiculo.getValor());
  }
}
