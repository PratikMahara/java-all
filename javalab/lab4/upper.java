import java.util.*;
public class upper
{
	public static void main(String args[])
	{

		Scanner ob=new Scanner(System.in);
		System.out.println("enter the rows");
		int row=ob.nextInt();
		System.out.println("enter the column");
		int column=ob.nextInt();
		int [][] arr=new int [row][column];
		int i;
		int j;
		System.out.println("enter the elements in "+row+"*"+column+" matrix ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
			arr[i][j]=ob.nextInt();
				}
			}

		System.out.println("the entered matrix is");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("the upper traingular matrix is");
			for(i=0;i<row;i++)
					{
						for(j=0;j<column;j++)
						{
							if(i>j )
							{
								System.out.print(" ");
								continue;

							}
							if(i==j)
						{
							System.out.print(" ");
							continue;
							}
							System.out.print(arr[i][j]+" ");
						}
						System.out.println(" ");
							}

			}
		}
