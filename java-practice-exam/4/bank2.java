class bank2 implements personalloan
{
	static float rate=0.15f;

public float find(float principal, int year)
	{
		float simple=(principal*year*rate)/100;
		System.out.println("the simple interest in bank2 is "+simple);
		return simple;
		}

	}