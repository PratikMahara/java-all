class time
{

	int second=0;
	int minute=0;
	int hour=0;
	time(int s)
	{
		second=s;
		}

		time(int s, int m)
		{
			second=s;
			minute=m;

			}
				time(int s, int m, int h)
					{
						hour=h;
						minute=m;
						second=s;

			}
			void display()
			{
				System.out.println("the time is "+hour+  "hour  "+minute+"min  "+second+"sec");
				}

	}