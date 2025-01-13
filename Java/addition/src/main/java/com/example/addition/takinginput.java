package com.example.addition;

import java.util.Scanner;

public class takinginput {
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        System.out.println("enter the third number");
        c=sc.nextInt();
        int sum=a+b+c;
        System.out.println(sum );

    }
}