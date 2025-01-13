class superexception
{
	int a=0;
	int b=5;
superexception()
{
	try
	{
	int c=b/a;
}
catch(ArithmeticException k)
{
System.out.println("ArithmeticException in super class");
	}

}

	}