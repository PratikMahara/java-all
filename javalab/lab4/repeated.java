import java.util.*;
public class repeated
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int [] arr= new int[5];
		int i;
		int j;
		int x=0;
		System.out.println("enter 5 numbers to find the repeated one");
		for(i=0;i<5;i++)
		{
			arr[i]=ob.nextInt();
			}
		for(i=0;i<5;i++)
		{

			for(j=i+1;j<5;j++)
			{
				if(arr[i]==arr[j])
				{

					System.out.println("repeated numbers is "+arr[j]);
					}
				}

			}

		}
	}