class derive extends base
{
float height;

derive(float l, float w, float h)
{
	super(l,w);
	height=h;

	}
	void area()
	{
		System.out.println("from derive constructor");
		}
		void volume()
		{
			System.out.println("the volume is "+(length * width * height));
			}

	}