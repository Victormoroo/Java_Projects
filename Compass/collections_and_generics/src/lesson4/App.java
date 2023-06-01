package lesson4; //Mesclar listas

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class App {
  public static void main(String[] args) {
    
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(12);
    list1.add(43);
    list1.add(15);
    list1.add(67);
    list1.add(43);
    list1.add(10);
    list1.add(10);
    list1.add(10);

    ArrayList<Integer> newList = new ArrayList<Integer>();
    newList.add(10);
    newList.add(67);
    newList.add(15);

    // list1.addAll(newList); // junta as duas listas
    // list1.removeAll(newList); //remove todos os items q esta na newlist de tudo
    // list1.clear(); // limpa a list1

    // boolean hasValue = list1.contains(67); // verifica se contem tal coisa
    boolean hasValue = list1.isEmpty(); // verifica se a lista esta vazia ou nao

    list1.retainAll(newList); // a list1 ira reter tudo que esta na newList, e so ira aparecer os valores da newList, ou que tem nas duas

    // System.out.println(list1);
    // System.out.println(list1.contains(48));
    System.out.println(hasValue);


    HashSet<String> hashSet = new HashSet<String>();
    // hashSet.add(12);
    // hashSet.add(43);
    // hashSet.add(15);
    // hashSet.add(67);
    // hashSet.add(43);
    // hashSet.add(10);

    hashSet.add("Victor");
    hashSet.add("Henrique");
    hashSet.add("Marcio");
    hashSet.add("Daniel");

    List<String> li = new ArrayList<String>(hashSet); //Transforma um conjunto em um array (HashSet -> ArrayList)

    Collections.sort(li); // ira colocar o Hash em ordem
    System.out.println(li);

    
  }
}
