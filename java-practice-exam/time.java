class time
{

	int hour;
	int minute;
	int second;
	time(int h, int m, int s)
	{

		this.hour=h;
		this.minute=m;
		this.second=s;
		}
		void add(time o)
		{

			int sec=this.second+ o.second;
			int min=this.minute+ o.minute;
			int hours=this.hour+o.hour;
			if(sec>=60)
			{
				min=min+sec/60;
				sec=sec%60;

				}


				if(min>=60)
				{
					hours=hours+min/60;
					min=min%60;
					}
					System.out.println("the added time is "+hours+"hour"+min+"minutes"+sec+"second");

			}
	}