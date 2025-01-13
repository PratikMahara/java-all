class create1  extends Thread
{
	public  synchronized  void run()
	{
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("hello"+i+""+Thread.currentThread().getName());

			}
	}
	}

	public class synchronizedthread
	{
		public static void main(String args[])
		{
			create1 obj1=new create1();

			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj1);
			t1.start();
			t2.start();

			}
		}