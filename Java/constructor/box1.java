import java.util.*;
public class box1
{
	public static void main(String args[])
	{
		box ob1=new box(10,20,30);
int vol=ob1.volume();
System.out.printf("volume is "+vol);
box ob2=new box(10);
 vol=ob2.volume();
System.out.printf("volume is "+vol);
box ob3=new box();
 vol=ob3.volume();
System.out.printf("volume is "+vol);
		}
	}