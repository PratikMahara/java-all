
class time
{
	int horr;
	int min;
	int sec;
	time(int h, int m, int s)
{
	this.horr=h;
	this.min=m;
	this.sec=s;
	}

	void add(time o)
	{
		int second=this.sec+o.sec;
		int minute=this.min+o.min;
		int hour=this.horr+o.horr;

		if(second>60)
		{
			minute+=second/60;
			second=second%60;
			}
			if(minute>60)
			{
				hour+=minute/60;
				minute=minute%60;
				}
				System.out.println("hour:"+hour+"  minutes:"+minute+"second"+second);
		}
		void sub(time o)
	{
				int second=this.sec-o.sec;
				int minute=this.min-o.min;
				int hour=this.horr-o.horr;

				if(second>60)
				{
					minute+=second/60;
					second=second%60;
					}
					if(minute>60)
					{
						hour+=minute/60;
						minute=minute%60;
						}
						System.out.println("difference in time");
				System.out.println("hour:"+hour+"  minutes:"+minute+"second"+second);
		}
	}

public class timeadd
{
	public static void main(String args[])
	{

		time obj=new time(2,40,20);
		time obj1=new time(1,20,15);
		obj.add(obj1);
		obj.sub(obj1);
	}
	}