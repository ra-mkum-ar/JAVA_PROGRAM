package ARRAYSOFTWODIMENSIONAL;

import java.util.Scanner;

public class LARGEST_ROW_OR_COLUMN {
	
	public static void Largestroworcol(int a[][])
	{
		int row=a.length;
		int col=a[0].length;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<row;i++)
		{
			int rowsum=0;
			for(int j=0;j<col;j++)
			{
				rowsum=rowsum+a[i][j];
				if(rowsum>max1)
				{
					max1=rowsum;
					index=i;
				}
			}
			
		}

		for(int j=0;j<col;j++)
		{
			int rowcol=0;
			for(int i=0;i<row;i++)
			{
				rowcol=rowcol+a[i][j];
				if(rowcol>max2)
				{
					max2=rowcol;
					index=j;
				}
			}
			
		}

		
		if(max1>max2)
		{
			System.out.println("row"+" "+index+" "+max1);
		}
		else
		{
			System.out.println("column"+" "+index+" "+max2);
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		Largestroworcol(arr);
		
		s.close();

	}

}
