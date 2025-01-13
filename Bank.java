import java.util.*;

class NegativeAmountException extends Exception
{
	NegativeAmountException()
	{
		System.out.println("Negative amount entered");
		}
	}



		public class Bank
		{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				float a=1000;
				System.out.println("you have RS 1000 in your bank");
				System.out.println("enter the amount ");
					float amt=sc.nextFloat();
				System.out.println("press 1 for deposite || press 2 for withdrawal");

				int b=sc.nextInt();
				if(b==1)
				{
					try{
					deposite( amt,  a );
				}
				catch(NegativeAmountException l)
				{
					System.out.println("you have entered negative amount please enter the positive number");
					}
					}


					if(b==2)
					{
						try{
							withdraw(amt,  a);
							}
							catch(NegativeAmountException l)
											{
												System.out.println("you have entered negative amount please enter the positive number");
					}
						}

				}

				static void deposite(float amt, float a) throws NegativeAmountException
				{
					if(amt<0)
					{
						throw new NegativeAmountException();
						}
						else
						{
							System.out.println("depositing RS"+amt+"new Bank account:Rs"+(amt+a));
							}
					}
						static void withdraw(float amt, float a) throws NegativeAmountException
									{
										if(amt<0)
										{
											throw new NegativeAmountException();
											}
											else
											{
												System.out.println("withdrawing RS"+amt+"new Bank account:Rs"+(a-amt));
												}
					}


			}