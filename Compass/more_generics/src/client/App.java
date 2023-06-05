package client;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> myList = new ArrayList<>();

        myList.add("hello");
        // myList.add(100);
        // myList.add(false);

        // Como eu não declarei o tipo no Array, eu preciso dizer qual tipo do dado que estou pegando entre ()
        String myval = (String) myList.get(0);

        // Ele permite que voce coloque como string, pois o Java não sabe do que se trata o dado no index 1
        String myval2 = (String) myList.get(1);
    }
}
