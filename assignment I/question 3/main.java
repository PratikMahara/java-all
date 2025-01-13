import java.util.*;
public class main
{
	public static void main(String ar[])

{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the address name");
	String name=sc.next();
	address obj1=new address();
	obj1.setaddress(name);
	obj1.getaddress();
	obj1=new home_address();
	obj1.setaddress(name);
	obj1.getaddress();
	obj1=new office_address();
	obj1.setaddress(name);
	obj1.getaddress();


	}
	}