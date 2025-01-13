import java.util.*;
public class main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your roll no and registration number");
		int roll=sc.nextInt();
		int  reg=sc.nextInt();
		student obj=new kittian();
		obj.course(roll,reg);
		}
	}