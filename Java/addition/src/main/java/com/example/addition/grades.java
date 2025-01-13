package com.example.addition;

import java.util.Scanner;

public class grades {
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        System.out.println("enter the marks you got");
        float marks= obj.nextFloat();

        if(marks>=90 && marks<=100)
        {
            System.out.println("O grade");
        }
        if(marks>=80 && marks<90)
        {
            System.out.println("E grade");
        }
        if(marks>=70 && marks<80)
        {
            System.out.println("A grade");
        }
        if(marks>=60 && marks<70)
        {
            System.out.println("B grade");
        }
        if(marks>=50 && marks<60)
        {
            System.out.println("C grade");
        }
        if(marks>=1 && marks<50)
        {
            System.out.println("NO grade fail");
        }

    }
}
