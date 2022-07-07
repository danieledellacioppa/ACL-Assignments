package com.company;

public class Main //implements Runnable
{

    public static void main(String[] args)
    {
      System.out.println("main() of Main class");

//    HelloRunnable helloRunnable=new HelloRunnable();
//    helloRunnable.run();

      (new Thread(new HelloRunnable())).start();
      HelloThread helloThread = new HelloThread();
      helloThread.run();

      System.out.println("main() about to finish");

//      (new Thread(new Main())).start();
    }
//    @Override
//    public void run() {
//        System.out.println("Hello from Main thread!");
//    }
}
