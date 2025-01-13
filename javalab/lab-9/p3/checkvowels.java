import java.util.*;
public class checkvowels
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check the number of words in vowels");
		String str= sc.nextLine();
		int count=0;
		int counta=0;
		int i;
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		if(ch == 'A' || ch =='a' || ch=='E'|| ch=='e' || ch=='I' || ch=='i' || ch=='O' ||  ch=='o' || ch =='U' || ch =='u' )
		{
			count++;
			}
			else
			{
				counta++;
				}
		}

		System.out.println("the number of vowels is "+count);
System.out.println("the number of Consonants is "+counta);

		}
	}