package com.example.additin;

import java.util.Scanner;

public class palindrome {
    public static void main( String arg[])
    {
        int r,  sum=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number to check whether it is palindrome or not ");
        int num= ob.nextInt();
        int temp=num;
        while(num!=0

        {
          r=num%10;
          sum=(sum*10)+r;
          num=num/10;
        }
        if (sum==temp)
        {
            System.out.println("palindrome");

        }
        else
        {
            System.out.println("not palindrome");
        }
    }

}
