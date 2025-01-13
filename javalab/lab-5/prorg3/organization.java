class manager
{
 int departmentid;
	int employeeid;
	  int leave;
	manager(int n,int id, int eid)
	{
		departmentid=id;
		employeeid=eid;
		leave=n;
	}
	void amount()
	{
		int amount=leave*400;
		System.out.println("the manager departid is "+departmentid+"empoyee id is"+employeeid);
		System.out.println("the amount in leave encashement for manager is"+amount);
		}
	}
	class worker extends manager
	{


		worker(int n, int id, int eid)
		{
			super(n,id,eid);


			}
			void amount()
				{
					System.out.println("the manager departid is "+departmentid+"empoyee id is"+employeeid);
					int amount=leave*500;
					System.out.println("the amount in leave encashement for worker is"+amount);
		}

		}
		class other extends manager
			{


				other(int n, int id, int eid)
				{
					super(n,id,eid);


					}
					void amount()
						{
							System.out.println("the manager departid is "+departmentid+"empoyee id is"+employeeid);
							int amount=leave*600;
							System.out.println("the amount in leave encashement for other is"+amount);
				}

		}