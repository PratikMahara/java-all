class woodbox extends box
{
	float thick;
	woodbox(float l,float w,float h, float t)
	{
		length =l;
		width=w;
		height=h;
		thick=t;
		System.out.println("from constructor woodbox having four parameter");
		}
woodbox(float l, float w, float h)
{
super(l,w,h);
	thick =0;

	}

	void showthick()
	{
		System.out.println("the thickness is "+thick);
		}

	}

