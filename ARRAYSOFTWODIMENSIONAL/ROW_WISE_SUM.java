package ARRAYSOFTWODIMENSIONAL;
import java.util.*;
public class ROW_WISE_SUM {
	
	public static void rowwisesum(int a[][])
	{
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<row;i++)
		{
			int rowsum=0;
			for(int j=0;j<col;j++)
			{
				rowsum=rowsum+a[i][j];
			}
			System.out.print(rowsum+" ");
		}
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
		rowwisesum(a);
		s.close();

	}

}
