import java.util.Scanner;
public class array{

	public static void main(String [] args)
	{
		Scanner obj= new Scanner(System.in);
		int n;
		System.out.println("enter the size of the array");
		n=obj.nextInt();

	 int []arr= new int[n];

	 System.out.println("enter the "+n+" numbers to print");
	 for(int i=0;i<n;i++)
	 {

	  arr[i]=obj.nextInt();
	}
	for(int j=0;j<n;j++)
	{
		System.out.println("the value is"+arr[j]);
	}
}
}