import java.util.*;
class hrsexception extends Exception
{
	hrsexception()
	{
		System.out.println("it is hour exception");
		}
	}
	class minexception extends Exception
	{
		minexception()
		{
			System.out.println("it is minute exception");
			}
	}
	class secexception extends Exception
	{
	secexception()
		{
			System.out.println("it is second exception");
			}
	}
	class time
	{
		Scanner sc=new Scanner(System.in);
		void hour() throws  hrsexception
		{
		int hr;
		System.out.println("enter hour");
		hr=sc.nextInt();
		if(hr<0 || hr>24)
		{
			throw new hrsexception();
			}
			}
void min() throws  minexception
		{
		int min;
		System.out.println("enter minute");
		min=sc.nextInt();
		if(min<0 && min>60)
		{
			throw new minexception();
			}
			}
		}
		public class exception
		{
			public static void main(String args[])
			{
				time t=new time();

				try{
					t.hour();
t.min();
					}
					catch(hrsexception e)
					{
System.out.println("please enter valid hour");
						}
						catch(minexception e)
						{System.out.println("please enter valid min");

							}

				}
			}