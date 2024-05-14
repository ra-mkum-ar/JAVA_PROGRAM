package ARRAYSOFTWODIMENSIONAL;
import java.util.Scanner;
public class PRINT_ROW_WISE {
	
	public static int[] Printrowwise(int a[][])
	{
		int row =a.length;
		int col =a[0].length;
		int result[] = new int[row*col];
		int k=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				result[k]=a[i][j];
				k++;
			}
		}
		return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int col=s.nextInt();
		int row=s.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int res[] = new int[row*col];
		res=Printrowwise(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]);
		}
		s.close();
		

	}

}
