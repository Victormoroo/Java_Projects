package practice_strings;

public class StringsPractice {
  public static void main(String[] args) {
    
    String str = "ABCDEFG";

    String extractedString = str.substring(1);

    System.out.println(extractedString);

    String a = "hello";
    String b = "world";

    if(a == "hello") {
      //Forma errada
    }

    if(a.equals("hello")) {
      //Forma correta
    }

    if(b.equals("world")) {
      System.out.println("Printed world!");
    }

    if(b.equalsIgnoreCase("WorLD")) { //Forma de igual mas ignorando a diferenca entre maiuscula e minuscula
      System.out.println("Printed WORLD!");
    }

    System.out.println(a.charAt(4)); //Pesquisa o conteudo pelo index

    String str2 = "My name is Victor";

    System.out.println(str2.indexOf("name", 4)); //Voce pode utilizar essa funcao para buscar algo especifico dentro da variavel, como por exemplo eu busquei "name", e ele encontrou a partir do indice 3, apos a virgula voce pode especificar a partir de qual indice voce quer pesquisar.

    System.out.println(str2.lastIndexOf("Victor")); //Faz a mesma coisa, porem ele procura a palavra que esta mais perto do fim da string
  }
}