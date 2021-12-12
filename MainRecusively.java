package com.eg;

//call main method from main recursively

public class MainRecusively
{
    String args[] = new String[10];
    static int i = 0;

    public static void main(String args[])
    {
          if (i >= 10) {
            return;
        }

        System.out.println("Hello" + i++);
        main(args);
    }
}