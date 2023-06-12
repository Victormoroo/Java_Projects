package lesson3;

public class Animal {
  
  String name;
  int agr;
  double weigth;

  public Animal(String name, int agr, double weigth) {
    this.name = name;
    this.agr = agr;
    this.weigth = weigth;
  }

  @Override
  public String toString() {
    return "Animal [name=" + name + ", agr=" + agr + ", weigth=" + weigth + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + agr;
    long temp;
    temp = Double.doubleToLongBits(weigth);
    result = prime * result + (int) (temp ^ (temp >>> 32));
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
    Animal other = (Animal) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (agr != other.agr)
      return false;
    if (Double.doubleToLongBits(weigth) != Double.doubleToLongBits(other.weigth))
      return false;
    return true;
  }
  
}
