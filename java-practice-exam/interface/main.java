import java.util.*;
public class main{

public static void main(String args[])
{
	float amt;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the principle and year for hdfc");
	calculate obj=new hdfc();
	amt=obj.interest(sc.nextFloat(),sc.nextInt());
	System.out.println("the interest amount for hdfc"+amt);
	System.out.println("enter the principle and year for icici");
	obj=new icici();
	amt=obj.interest(sc.nextFloat(),sc.nextInt());
System.out.println("the interest amount for icici"+amt);
	}
}