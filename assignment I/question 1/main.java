import java.util.*;
public class main
{
public static void main(String ar[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the time in hour , minute and second");
	int h=sc.nextInt();
	int m=sc.nextInt();
	int s=sc.nextInt();

			time obj1=new time(h,m,s);
			obj1.display();
			time obj2=new time(s,m);
			obj2.display();
			time obj3=new time(s );
			obj3.display();

	}
	}