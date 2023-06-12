package br.com.victor.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
  public static void main(String[] args) {
    
    ExecutorService executor = Executors.newFixedThreadPool(2); // Recicla Threads

    Runnable processor1 = new MessageProcessor(2);
    executor.execute(processor1);

    Runnable processor2 = new MessageProcessor(3);
    executor.execute(processor2);

    Runnable processor3 = new MessageProcessor(4);
    executor.execute(processor3);

    Runnable processor4 = new MessageProcessor(5);
    executor.execute(processor4);

    executor.shutdown(); // Rejeita o envio de novas tarefas
    // executor.shutdownNow(); // Encerra o executor imediatamente

    try {
      executor.awaitTermination(10, TimeUnit.SECONDS); // Ele ira aguardar 10 segundos antes de ir para a proxima linha, pode susbstituir o "while", porque dessa forma voce coloca quanto tempo ele ira esperar para ir para o final do codigo
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // while(!executor.isTerminated()) {
    //    // Loop para que enquanto o programa nao terminar o executor, ele nao ira imprimir que todas as tasks foram enviada
    // }

    System.out.println("Submitted all tasks...");

  }
}
