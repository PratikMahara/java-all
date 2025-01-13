class create1  extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("hello"+i);
			i++;
			}
	}
	}
	class create2 extends Thread
	{
		public void run()
		{
			int i;
			for(i=0;i<5;i++)
			{
				System.out.println("World"+i);
				i++;
				}
		}
	}
	public class thread
	{
		public static void main(String args[])
		{
			create1 obj1=new create1();
			create2 obj2=new create2();
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
			t1.start();
			t2.start();
			int i=20;
			for(i=0;i<20;i++)
			{
				System.out.println("hi from main"+i);
				}
			}
		}