class savingacc
{
	static float annualrate;
	private float savingbalance=1000;

	savingacc(float rate)
	{
		annualrate=rate;
		}

static void modifyrate(float rate)
			{
				annualrate=rate;

			}
	void monthlyrate()
	{
		float monthrate=(savingbalance*annualrate)/12;
		System.out.println("the monthly rate is "+monthrate);
		}



	}