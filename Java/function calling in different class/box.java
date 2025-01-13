class box{
int length;
	int breadth;
	int height;
int ll;
int bb;
	box(int l,int b, int h){

 length =l;
 breadth=b;
 height=h;
	}
box()
{
	length=ll;
	breadth=bb;
	}

	int volume()
	{
		return length*breadth*height;
}
void area()
{
	int area=ll*bb;
	System.out.println("area is "+area);
	}
}