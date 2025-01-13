class icici implements calculate
{
	public float interest(float principle,int year)
		{
			float rate=5;
			float amount=(principle * year *rate)/100;
			return amount;
		}
	}