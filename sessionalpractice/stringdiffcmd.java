import java.util.*;
public class stringdiffcmd
{
	public static void main(String args[])
	{
		String str1= args[0];
		System.out.println("first string is catched");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the second string ");
		String str2=sc.nextLine();

		int a=Stringdifference(str1,str2);
if(a==-1)
{
	System.out.println("strings are identical");
	}
	else
	{
		System.out.println("String differ at position "+a);
		}

		}

		static int Stringdifference(String str1, String str2)
		{
			int minlength;
			if(str1.length()>str2.length())
			{
				minlength=str2.length();
				}
				else
				{
					minlength=str1.length();
					}
					for(int i=0;i<minlength;i++)
					{
						if(str1.charAt(i)!=str2.charAt(i))
						{
							return i;
							}

							if(str1.length()!=str2.length())
							{
								return -1;
								}
						}

return 1;
			}
	}