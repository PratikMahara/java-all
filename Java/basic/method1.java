
//in this program i have created a method inside a same class and if i made the main function static then the  user defined
//method that is add in the same class also should be in static .
import java.util.Scanner;
public class method1{
  static int add(int x, int y)
 {
	 int z=x+y;
	 return z;
	 }
	public static void main(String []ar)
	{
		int a,b;
		System.out.println("enter the value of a and b");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
			b=obj.nextInt();
			int c=add(a,b);
			System.out.println("the sum is"+c);

		}
	}