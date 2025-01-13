//in this method how to make a object of the class and used that obj to call the function
//one trick is that we can call function which are in different classes by making the object of the class but without using package we have to see that the two program having different classes are in the same folder or not.
import java.util.Scanner;
public class method2{
  int add(int x, int y)
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
			method2 object=new method2();

			int c=object.add(a,b);
			System.out.println("the sum is "+c);



			// here i have called the class method of overloading
			overloading obj1= new overloading();
			int d=obj1.add(a);
			System.out.println("the second function in overloading executed "+d);

		}
	}