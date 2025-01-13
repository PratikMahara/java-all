import java.util.*;
public class stringoperation
{



	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to perfrom operation");
		String a=sc.nextLine();
		stringoperation obj=new stringoperation();
		String reverse=obj.reverse(a);
System.out.println("the reverse of the string is "+reverse);
//changing the case of the string
System.out.println("The uppercase of the string is "+a.toUpperCase());
System.out.println("The lowercase of the string is "+a.toLowerCase());
System.out.println("enter another string to compare with the first string");
String b=sc.nextLine();
System.out.println("the comparision between the string is"+a.compareTo(b));
System.out.println("Enter the string to insert between the first entered string");
String c=sc.nextLine();
System.out.println(a.substring(0,4)+c+a.substring(3));

		}

			String reverse(String rev)
			{
		int i;
		String result="";
		for(i=rev.length()-1;i>=0;i--)
		{
			result+=rev.charAt(i);
			}
			return result;
		}
	}