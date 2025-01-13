import java.util.*;
public class overloadingmul
{
	static void mul(int x, int y)
	{
		int d=x*y;
		System.out.println("multiplication is "+d);

		}
		static void mul(int x, int y, int z)
		{
			int d=x*y*z;
			System.out.println("multiplication is"+d);
			}

	public static void main(String args[] )
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the numbers for the multiplication");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();

		mul(a,b);

		mul(a,b,c);
		}

	}