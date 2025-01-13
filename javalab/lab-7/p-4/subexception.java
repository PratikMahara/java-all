class subexception extends superexception
{
	subexception()
	{
		int d=0;
		int e=6;
		try
		{
		int f=e/d;
	}
	catch(ArithmeticException j)
	{
		System.out.println("ArithmeticException in subclass");
	}
		}
	}