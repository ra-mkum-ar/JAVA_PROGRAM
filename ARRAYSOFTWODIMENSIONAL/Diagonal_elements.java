package ARRAYSOFTWODIMENSIONAL;
import java.util.*;
public class Diagonal_elements {
	
	public static String DiagonalElements(int a[][],int diag[])
	{
		int row=a.length;
		int col=a[0].length;
		if(row!=col)
		{
			return "NO";
		}
		
		for(int i=0;i<row;i++)
		{
			diag[i]=a[i][i];
		}
		return "YES";
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
		int diag[]=new int[Math.min(row,col)];
		String ans= DiagonalElements(a,diag);
		System.out.println(ans);
		if(ans.equals("YES"))
		{
			for(int i=0;i<row;i++)
			{
				System.out.print(diag[i]+" ");
			}
		}
		
		s.close();

	}

}
