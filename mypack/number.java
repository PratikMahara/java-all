package mypack;
public class number
{

	int num;
	public number(int n)
	{

		num=n;
	}

	public int factorial()
	{
		int i=num;
	int f=1;
		for(i=num;i>0;i--)
		{
		f =f*i;
			}
			return f;

		}

	}