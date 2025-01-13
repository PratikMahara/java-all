class create implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("from class create "+i);
			}
	}

	}
	public class threadcreation
	{
		public static void main(String args[])
		{
			int i;
			create myobj=new create();
			Thread thread=new Thread(myobj);
			thread.start();
			for(i=0;i<=20;i++)
			{
				System.out.println("from main"+i);
				}
			}
		}