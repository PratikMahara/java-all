import java.util.*;
public class largest{

	public static void main(String [] args)
	{
		Scanner obj= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the three numbers to check the largest one");
		a= obj.nextInt();
				b= obj.nextInt();
			c= obj.nextInt();
			if(a>b && a>c)
			{
				System.out.println(+a+" is the greatest");

				}
				if(b>a && b>c)
							{
								System.out.println(+b+" is the greatest");

				}
				else
				{
					System.out.println(+c+" is the greatest");
					}
		}
	}