class hi extends Thread
{

	public void run()
	{
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("hello"+i);
			}
		}
	}
	class hello extends Thread
	{

		public void run()
			{
				int i;
				for(i=0;i<10;i++)
				{
					System.out.println("world"+i);
					}
		}


		}

		public class priorthreading
		{
			public static void main(String args[])
			{
				hi obj1=new hi();
				hello obj2=new hello();
				Thread t1=new Thread(obj1);
				Thread t2=new Thread(obj2);
				t1.setPriority(1);
				t2.setPriority(10);
				t1.start();
				t2.start();
				}


		}