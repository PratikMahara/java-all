class box
{
	int length;
	int breadth;
	int height;
	box(int l,int b, int h)
	{

		length=l;
		breadth=b;
		height=h;

		}

		box(int l)
		{
			length=breadth=height=l;
			}
			box()
			{
				System.out.println("Elo Elo");
				}

				int volume()
				{
					return  length*breadth*height;

					}
	}