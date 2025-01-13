import java.util.*;
public class main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the salary of the employee");
double salary=sc.nextDouble();
substaff obj=new substaff();
obj.earnings(salary);
obj.deductions();
obj.bonus();
		}
	}