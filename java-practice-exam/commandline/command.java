import java.util.*;
public class command
{
	public static void main(String [] args)
{


	int a, b, c;
	a=Integer.parseInt(args[0]);
	b=10;
	c=20;
	argue obj=new argue(a,b);
	obj.print();
	argue obj2=new argue(a,b,c);
	obj2.print();

	}
	}