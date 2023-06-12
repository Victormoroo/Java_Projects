package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
  public static void main(String[] args) {
    
    // HashMap<String, String> dictionary = new HashMap<String, String>();
    // LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
    TreeMap<String, String> dictionary = new TreeMap<String, String>(); // ele importara em ordem alfabetica

    dictionary.put("Happy", "feliz");
    dictionary.put("Keyboard", "Teclado");
    dictionary.put("Hot", "quente");
    dictionary.put("You", "Voce");

    // for(String word : dictionary.keySet()) { //dessa forma vc pode iteragir entre as chaves desse dicionario
    //   System.out.println(dictionary.get(word));
    //   // System.out.println(word);
    // }

    for(Map.Entry<String, String> entry : dictionary.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
