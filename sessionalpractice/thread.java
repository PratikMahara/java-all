import java.util.*;
class name extends Thread
{
	String nam;
	name(String n)
	{
		nam=n;
		}
	public void run()
	{
		int i;
		for(i=0;i<nam.length();i++)
		{
			System.out.println(""+nam.charAt(i));
			System.out.println(""+Thread.currentThread().getName());
try{
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			System.out.println("exception");
			}
			}
		}
	}

public class thread
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your sweet name");
		String namme=sc.nextLine();
System.out.println(2+2+"KIIT");
	name obj=new name(namme);
	Thread t1=new Thread(obj);
	t1.start();

	for(int i=10;i>0;i--)
	{
		System.out.println("output:"+i);
		}
		}
	}