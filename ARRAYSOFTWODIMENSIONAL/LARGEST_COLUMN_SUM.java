package ARRAYSOFTWODIMENSIONAL;
import java.util.Scanner;
public class LARGEST_COLUMN_SUM {
	
	public static void LargestColumn(int a[][])
	{
		int row=a.length;
		int col=a[0].length;
		int max = Integer.MIN_VALUE;
		for(int j=0;j<col;j++)
		{
			int colSum=0;
			for(int i=0;i<row;i++)
			{
				colSum=colSum+a[i][j];
				if(colSum>max)
				{
					max=colSum;
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int a[][] = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		LargestColumn(a);
		s.close();

	}

}
