class user extends Exception
{
	public user()
	{
		System.out.println("please enter  postive dimenstion");
		}
	}
	public class userexception
	{
		public static void main(String args[])
		{
			try{
				area(-10,5);
				}
				catch(user e){
					System.out.println(e.getMessage());
					e.printStackTrace();

					}
			}
			static void area(int a, int b) throws user
			{
				if(a<0 || b<0)
				{
					throw new user();
					}
					int c=a*b;
					System.out.println("area is "+c);
				}
		}