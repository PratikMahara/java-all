import java.util.*;


class number implements Runnable
{
	int num;
	int end;
	number(int no, int e)
	{

	num=no;
	end=e;
	}
	public void run()
	{
		int i;
		for(i=num;i<end;i++)
		{
			System.out.println(""+i);
			try{
			Thread.sleep(5);
		}
		catch(InterruptedException e)
		{
			System.out.println("exception");
			}
		}
		}
	}
class name implements Runnable
	{
		int i;
		String str;
		name(String s)
		{
			str=s;
			}
			public void run()
			{
				for(i=0;i<str.length();i++)
				{
					System.out.println(""+str.charAt(i));
					}
			}

		}


public class threadassignment
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range enter first range");

		int n=sc.nextInt();
		System.out.println("enter the last  range ");
		int o=sc.nextInt();
		System.out.println("enter the name of the student");
		sc.nextLine();
		String c=sc.nextLine();
		number obj1=new number(n,o);
		name obj2=new name(c);
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
t1.start();
t2.start();
	}
	}