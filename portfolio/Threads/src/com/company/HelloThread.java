package com.company;

public class HelloThread extends Thread
{
 public String[] messages={
         "Mares eat oats",
         "Does eat oats",
         "Little lambs eat ivy",
         "A kid will eat ivy too"
 };
    public void run()
    {
        try {
            for(int i=0; i < messages.length; i++){
                Thread.sleep(2000);
                System.out.println(messages[i]);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from HelloThread!");
    }

    public static void main(String args[])
    {
        (new HelloThread()).start();
    }

}