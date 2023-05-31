public class Veiculo {

  private String marca;
  private String modelo;
  private String cor;
  private int valor;

  public Veiculo(String marca, String modelo, String cor, int valor) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.valor = valor;
  }

  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }
  public int getValor() {
    return valor;
  }
  public void setValor(int valor) {
    this.valor = valor;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((marca == null) ? 0 : marca.hashCode());
    result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
    result = prime * result + ((cor == null) ? 0 : cor.hashCode());
    result = prime * result + valor;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Veiculo other = (Veiculo) obj;
    if (marca == null) {
      if (other.marca != null)
        return false;
    } else if (!marca.equals(other.marca))
      return false;
    if (modelo == null) {
      if (other.modelo != null)
        return false;
    } else if (!modelo.equals(other.modelo))
      return false;
    if (cor == null) {
      if (other.cor != null)
        return false;
    } else if (!cor.equals(other.cor))
      return false;
    if (valor != other.valor)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", valor=" + valor + "]";
  }

}
