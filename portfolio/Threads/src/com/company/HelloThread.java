package com.company;

public class HelloThread extends Thread
{

    public void run()
    {
        try {
            Thread.sleep(2000);
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