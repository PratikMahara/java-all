class create1  extends Thread
{
	public void run()
	{
	System.out.println("Good Morning");
			}
	}

	class create2 extends Thread
	{
		public void run()
		{
			System.out.println("Good Afternoon");
				}
		}

	class create3 extends Thread
		{
			public void run()
			{
				System.out.println("Good Night");
					}
			}

	public class sleepthread
	{
		public static void main(String args[])
		{
			create1 obj1=new create1();
			create2 obj2=new create2();
			create3 obj3=new create3();
			;
			Thread t2=new Thread(obj2);
			Thread t3=new Thread(obj3);
			Thread t1=new Thread(obj1);
			try
			{
	      t1.sleep(2000);
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println("im exception interrupt thread");
		  }

		  t1.start();
	  t2.start();
t3.start();

			}
		}