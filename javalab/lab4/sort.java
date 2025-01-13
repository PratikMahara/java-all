import java.util.*;
public class sort
{

	public static void main(String args[])
	{
	Scanner ob=new Scanner(System.in);
	int i;
	int [] arr=new int [10];
	System.out.println("enter 10 numbers to be sorted");
for(i=0;i<10;i++)
{
	arr[i]=ob.nextInt();

	}
	Arrays.sort(arr);
	System.out.println("The sorted array is :");
	for(int p:arr)
	{
		System.out.println(p+"");
		}

		}
	}