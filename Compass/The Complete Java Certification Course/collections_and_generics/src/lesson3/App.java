package lesson3; //CONJUNTO

import java.util.HashSet;
import java.util.LinkedHashSet;

public class App {
  public static void main(String[] args) {
    
    HashSet<Animal> values = new HashSet<Animal>(); // Sem o lenked, ele imprime em ordem aleatoria, ja com o Linked ele deixa na ordem de insercao
    // LinkedHashSet<String> values = new LinkedHashSet<String>();

    // values.add("Random");
    // values.add("Animal");
    // values.add("Friend");
    // values.add("Zoo");
    // values.add("Car");

    values.add(new Animal("Cacau", 7, 10.5));
    values.add(new Animal("Toto", 3, 12.00));
    values.add(new Animal("Toto", 3, 12.00));
    // Ele nao consegue lidar com mais de uma valor, para corrigir igualdade, precisa ser criado o equals no metodo Animal


    for(Animal value : values) {
      System.out.println(value.toString());
    }
  }
}
