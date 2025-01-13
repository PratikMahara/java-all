import java.util.Scanner;

public class class2{
	public static void main(String [] args)
	{
		float l,b,h;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the lenght , breadth and height ");
		l=obj.nextFloat();
		b=obj.nextFloat();
		h=obj.nextFloat();
		class1 object= new class1();
		float vol=object.volume(l,b,h);
		System.out.println("the volume is"+vol);
		}
	}