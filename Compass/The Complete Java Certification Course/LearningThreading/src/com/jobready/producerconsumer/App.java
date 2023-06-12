package com.jobready.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    
    List<Integer> questionlist = new ArrayList<>();

    Thread t1 = new Thread(new Producer(questionlist));
    Thread t2 = new Thread(new Consumer(questionlist));

    t1.start();
    t2.start();
  }
}
