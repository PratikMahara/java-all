class bank1 implements personalloan
{
	static float rate=0.10f;

public float find(float principal, int year)
	{
		float simple=(principal*year*rate)/100;
		System.out.println("the simple interest in bank1 is "+simple);
		return simple;
		}

	}