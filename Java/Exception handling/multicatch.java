class multicatch
{
	public static void main(String args[])
	{

		int a=0;
		int b=5;

		try
		{

			int c=b/a;

			}
			catch(ArithmeticException d)
			{
			System.out.println("arithmetic exception occurs");

			}
				catch(ArrayStoreException f)
				{
				System.out.println("array store exception occurs");
				}
				catch(Exception e)
				{
					System.out.println("it is a super class of all exception. EXCEPTION OCCURS");
					}

		}
	}