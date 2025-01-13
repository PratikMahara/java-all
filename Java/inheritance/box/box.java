class box
{
	float length ;
	float width;
	float height;
	box()
	{length =0;
	width=0;
	height=0;
	System.out.println("from default const");

		}
		box(float l, float w, float h)
		{
			length=l;
			width=w;
			height=h;
			System.out.println("from parametrized constructor");
			}

			void volume()
			{
				float vol=(length * width * height);
				System.out.println("the volume is"+vol);
				}
	}

