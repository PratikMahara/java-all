class plastic
{
	int length;
	int breadth;


plastic(int l,int b)
{
	length =l;
	breadth=b;
	}
			 void costtwo()
			{
				System.out.println("this is a 2D sheet ");

				int cost=40*length*breadth;
				System.out.println("the final price of the 2-d sheet as per the given dimensions is"+cost);
				}



	}
	class third extends plastic
	{
		int height;
		third(int l,int b,int h)
		{
			super(l,b);
			height=h;


				}

void costthree()
			{
				System.out.println("this is a 3D sheet ");
				int cost=60*length*breadth*height;
							System.out.println("the final price of the 3d sheet as per the given dimensions is"+cost);

		}

    }