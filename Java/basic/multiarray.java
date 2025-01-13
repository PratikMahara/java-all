import java.util.Scanner;
public class multiarray{
	public static void main(String [] ar)
	{
		int i,j;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the size of the matrix in row");
		int row=obj.nextInt();
		System.out.println("enter the size of the matrix in column");
		int col=obj.nextInt();
				int [][]arr=new int[row][column];
		System.out.println("enter the elements of the array");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=obj.nextInt();

				}
			}
			System.out.println("the array enter is");
			for(i=0;i<row;i++)
					{
						for(j=0;j<col;j++)
						{
							System.out.print(arr[i][i]+" ");


							}
							System.out.println();
			}

	}