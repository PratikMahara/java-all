import java.util.*;
public class StringOperation
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to perfrom operation");
		String s=sc.nextLine();
		System.out.println("the substring given one parameter is: "+s.substring(3));
		System.out.println("the substring given two parameter is :"+s.substring(2,5));
		System.out.println("the replacement of one char with another int the string"+s.replace('a','e'));
		System.out.println("the concationation pf first string with second is :" +s.concat("hello"));
		System.out.println("for triming the string:"+s.trim());
		System.out.println("the lower case of the entered string is="+s.toLowerCase());
		System.out.println("the UPPER CASE of the entered string is="+s.toUpperCase());
		short x=10;
		x=x*5;
		System.out.println(x);
		}
}
