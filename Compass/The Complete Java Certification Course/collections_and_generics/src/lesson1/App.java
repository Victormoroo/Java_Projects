package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // Dessa forma voce declara um tipo de dado especifico para esse Array (<String>)
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("world");
        words.add("10");
        // words.add(9);
        // words.add(12.00);
        // words.add('H');

        // Voce precisa especificar qual o tipo do dado que voce esta resgatando, tanto na variavel como no .get, pois ele esta buscando como um objeto, e isso precisa ser alterado manualmente
        // int item1 = (int) words.get(2);
        String item1 = words.get(2);
        System.out.println(item1);


        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(100);
        numbers.add(50);
        numbers.add(200);
        numbers.add(1000);
        numbers.remove(2);

        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
