class base
{
	float length,width;
	base(float l, float w)
	{
	length =l;
	width=w;
	System.out.println("from  constructor base");
		}
		 void area(){

			 System.out.println("the area is"+(length*width));
			 }
			 void volume()
			 {
				 System.out.println("volume in base constructor");
				 }


	}