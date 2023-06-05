package com.jobready.threading;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting Thread 1");
        // taskRunner.start();
        Thread t1 = new Thread(new Task("Thread-A"));
        t1.start();

        System.out.println("Starting Thread 2");
        // taskRunner2.start();
        Thread t2 = new Thread(new Task("Thread-B"));
        t2.start();
    }
}

// class Task extends Thread {
class Task implements Runnable {

    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(name);

        for(int i=0; i<1000; i++) {
            System.out.println("number: " + i + " - " + Thread.currentThread().getName());

            try {
                Thread.sleep(10); //desacelera a impressao
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
