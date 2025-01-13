class mythread extends Thread
{
	public void run()
	{
		int i=1;
		while(true)
		{
		System.out.println("hello"+i+""+Thread.currentThread().getName());
		try{
		Thread.sleep(800);
	}
	catch(InterruptedException e)
	{
		System.out.println("intterupt");
		}
		i++;
	}
	}


	}

	public class threadclass
	{
		public static void main(String args[])
		{
			int i=1;
			mythread obj=new mythread();
			Thread thread=new Thread(obj);
			obj.start();
			while(true)
			{
				System.out.println("world"+i+""+Thread.currentThread().getName());
	try{
		Thread.sleep(800);
	}
	catch(InterruptedException e)
	{
		System.out.println("intterupt");
		}
				}
			}
		}