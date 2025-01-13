//in this program a method with same name but having different parameters works as different function ,these method with same name can be in same class or different.
// i also have called the function add(int x, int y ) int the another class in program method 2
public class overloading{

	static int add(int x,int y)
	{
		int z=x+y;
		return z;

	}
	static int add(int p)
	{
		int e=10*p;
		return e;
		}

	public static void main(String [] args)
	{
	int a=7;
	int b=6;
	int c;
	if(a<b)
	{
		c=add(a,b);
		}
		else
		{
			c=add(a);
			}
			System.out.println(c);

		}
	}