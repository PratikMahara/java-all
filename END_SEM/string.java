import java.util.*;
public class string
{
	public static void main(String args[])
{
	int count=0;
	Scanner sc=new Scanner(System.in);
	String str;

	System.out.println("Enter the string to peform the operation");
	str=sc.nextLine();

System.out.println("enter the character to check how many time the character is repeated");
char c=sc.next().charAt(0);
for(int i=0;i<str.length();i++)
{

	if(str.charAt(i)==c)
	{
	count++;
		}
	}

System.out.println("the entered character is repeated "+count+" times");


System.out.println("--------------------------------------------------------------------------------------");
System.out.println("checing the number is palindrome or not");
int j=str.length()-1;
int k;
for(k=0;k<str.length();k++)
{
	if(str.charAt(k)!=str.charAt(j))
	{
		System.out.println("it is not palindrome");
		}
		if(k==str.length()-1)
		{
			System.out.println("entered string is palindrome");
			}
			j--;

	}
	}
	}