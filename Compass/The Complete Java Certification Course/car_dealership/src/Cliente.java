public class Cliente {
  
  private String nome;
  private String endereco;
  private double dinheiro;
  
  public Cliente(String nome, String endereco, double dinheiro) {
    this.nome = nome;
    this.endereco = endereco;
    this.dinheiro = dinheiro;
  }
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public double getDinheiro() {
    return dinheiro;
  }
  public void setDinheiro(double dinheiro) {
    this.dinheiro = dinheiro;
  }
  
  public void compraCarro(Veiculo veiculo, Funcionario func, boolean financas) {
    func.lidarCliente(this, financas, veiculo);
  }

}
