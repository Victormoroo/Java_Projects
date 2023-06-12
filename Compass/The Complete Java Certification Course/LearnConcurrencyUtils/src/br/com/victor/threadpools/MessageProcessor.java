package br.com.victor.threadpools;

public class MessageProcessor implements Runnable {
  
  private int message;

  MessageProcessor(int message) {
    this.message = message;
  }

  @Override
  public void run() {

    System.out.println(Thread.currentThread().getName() + " [RECEIVED] Message = " + message);
    respondToMessage(); // fará com que o thread durma, para simular a execucao de algum trabalho
    System.out.println(Thread.currentThread().getName() + " (DONE) Processing Message = " + message);
  }

  private void respondToMessage() {

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      System.out.println("Unable to process message " + message);
    }
  }
}
