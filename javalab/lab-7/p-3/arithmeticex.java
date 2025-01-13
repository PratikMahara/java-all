import java.util.*;
public class arithmeticex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a and b to divide such that a divides b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try{
		int c=b/a;
		System.out.println("the value of a divides b is"+c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("hehe arithmetic exception is found");
		}
			finally
		{
			System.out.println("hehe you have done error i will give you another chance my son");
			System.out.println("enter the value of a and b");
			int d=sc.nextInt();
		int e=sc.nextInt();
		int f=e/d;
		System.out.println("the value of a divides b is"+f);
			}
		}


}

