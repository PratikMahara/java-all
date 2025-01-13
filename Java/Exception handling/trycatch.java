public class trycatch
{
	public static void main(String args[])
	{
		int a=0;
		int b=5;

		try{
			System.out.println("entry of the try");
			int c=b/a;
			System.out.println("end of the try");
		}

		catch(ArithmeticException d)
		{
			System.out.println("Exception occurs at line 9 so you can remove it by alloting the value of a non-zero");
			}
			System.out.println("End of the program");
		}
	}