abstract class manager implements iface
{
	double sal;
	public void earnings(double salary)
	{
		sal=salary;
		System.out.println("Earning is "+sal);
	}
	public void deductions()
	{
		double tax=0.12;
		double deduction=sal*tax;
		System.out.println("the deduction amount is "+deduction);
		}

	}