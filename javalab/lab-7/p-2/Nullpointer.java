public class Nullpointer
{
	public static void main(String args[])
	{
	 String str=null;
try
{
	System.out.println("the length of the string is"+str.length());
}
catch(NullPointerException e)
{
	System.out.println("HEHEHEHE null pointer exception is found");
	}

  }
	}