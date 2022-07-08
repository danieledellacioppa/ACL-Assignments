package com.company;

public class Main
{

    public static void main(String[] args)
    {
      System.out.println("I am a simple Main class with simple main() launching threads");

      System.out.println("(new Thread(new HelloRunnable())).start();");
      (new Thread(new HelloRunnable())).start();

      System.out.println("HelloThread helloThread = new HelloThread();");
      HelloThread helloThread = new HelloThread();
      System.out.println("helloThread.run();");
      helloThread.run();
      System.out.println("main() after helloThread launched");
      System.out.println("main() about to finish");
    }

}
