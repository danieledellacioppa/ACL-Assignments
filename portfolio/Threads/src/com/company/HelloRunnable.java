package com.company;

public class HelloRunnable implements Runnable {

    public void run() {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello from HelloRunnable!");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }

}
