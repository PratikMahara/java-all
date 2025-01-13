import java.util.*;
public class operation{

    public static void main (String [] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the two numbers for operation ");
        int a= obj.nextInt();
        int b= obj.nextInt();
        System.out.println("For bitwise and operation  ");
        int c;
        c=a & b;
        System.out.println("For bitwise or operation  ");
        c=a|b;
        System.out.println("For bitwise xor operation  ");
        c= a^b;

    }
}