package com.example.addition;

import java.util.Scanner;

public class Case
{
    public static void main(String arg[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the day you want to print");

        int day= obj.nextInt();

    int da = day % 7;

if(day>0 && day<=31) {
    switch (da) {

        case 1: {
            System.out.println("monday");
            break;
        }
        case 2: {
            System.out.println("tuesday");
            break;
        }
        case 3: {
            System.out.println("wednesday");
            break;
        }
        case 4: {
            System.out.println("thursday");
            break;
        }
        case 5: {
            System.out.println("friday");
            break;
        }
        case 6: {
            System.out.println("saturday");
            break;
        }
        case 0: {
            System.out.println("sunday");
            break;
        }

    }
}
else {
    System.out.println("invalid day");
}

    }

}
