package com.company;

public class Main implements Runnable
{

    public static void main(String[] args)
    {
    System.out.println("ciao");
//    HelloRunnable helloRunnable=new HelloRunnable();
//    helloRunnable.run();
      (new Thread(new HelloRunnable())).start();
    }

    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }
}
