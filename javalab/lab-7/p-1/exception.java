import java.util.*;
public class exception
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int []arr=new int [10];
		int i;
		System.out.println("Enter 10 elements in array");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			}

			System.out.println("enter up to which index you want to traverse");
			int n=sc.nextInt();
			System.out.println("the traversed element are:");
			try
			{
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the entered traverse number  is larger than the size of the array");
			}

		}
	}