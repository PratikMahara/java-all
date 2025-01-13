public class conversion
{
	public static void main(String args[])
	{
		byte b;
	 int i=257;
		double d=323.142;
		System.out.println("conversion of int to byte");
		b=(byte) i;
		System.out.print("i and b "+i+"  "+b);
		System.out.println("conversion of double to byte");
		b=(byte)d;
		System.out.println("d and b"+d+"  "+b);
		}
	}