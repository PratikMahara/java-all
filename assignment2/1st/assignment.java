import java.util.*;

class NotEligibleException extends Exception
{
	NotEligibleException()
	{
		System.out.println("age below 18");
		}
	}
public class assignment
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("do you want to register press y/n");

		String choice=sc.nextLine();
		if(choice.equals( "y"))
		{
		 assignment obj=new assignment();
		 obj.Register();
			}
		}

		void Register()
		{
			Scanner o=new Scanner(System.in);
			System.out.println("Enter the details:");
			System.out.print("VOTERID:");
			int id=o.nextInt();
			System.out.print("NAME:");
			o.nextLine();
			String name=o.nextLine();
			System.out.print("AGE:");
			int age=o.nextInt();
			if(age<18)
			{
				try{
				throw new NotEligibleException();
			}
				catch(NotEligibleException e)
				{
					System.out.println("try better next year");
					}

				}

cast(id,name,age);
			}

			void cast(int id, String name, int age)
			{
				System.out.println("new vote");
				System.out.println("VOTERID: "+id+" NAME:"+name+" age:"+age);
				}
	}