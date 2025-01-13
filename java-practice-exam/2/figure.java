abstract class figure
{

	abstract void area();
	}

	class triangle extends figure
	{
		int base;
		int height;
		 triangle(int b, int h)
		{
			base=b;
			height=h;

		}

		void area()
		{
			int a= (1/2)*base*height;
			System.out.println("the area of triangle is "+a);
			}

		}

		class rectangle extends figure
	{
		int base;
		int height;
	rectangle(int b, int h)
		{
			base=b;
			height=h;

		}

		void area()
		{
			int a=base*height;
			System.out.println("the area of rectangle is "+a);
			}

		}