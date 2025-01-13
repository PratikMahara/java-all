import java.util.*;
public class diagonal
{
	public static void main(String args[])
	{

		Scanner ob=new Scanner(System.in);
		int [][] arr=new int [3][3];
		int i;
		int j;
		System.out.println("enter the elements in 3x3 matrix ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			arr[i][j]=ob.nextInt();
				}
			}

		System.out.println("the entered matrix is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			int right=arr[0][0]+arr[1][1]+arr[2][2];
			int left=arr[0][2]+arr[1][1]+arr[2][0];
			System.out.println("the right diagonal sum is "+right);
			System.out.println("the left diagonal sum is"+left);
		}

	}