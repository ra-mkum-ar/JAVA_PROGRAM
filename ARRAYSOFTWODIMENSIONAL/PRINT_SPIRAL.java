package ARRAYSOFTWODIMENSIONAL;

public class PRINT_SPIRAL 
{
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
		int rowlower=0;
		int rowupper=matrix.length-1;
		int collower=0;
		int colupper=matrix[0].length-1;
		while(rowlower<=rowupper && collower<=colupper)
		{
			for(int i=collower;i<=colupper;i++)
			{
				System.out.print(matrix[rowlower][i]);
			}
			rowlower++;
			for(int i=rowlower;i<=rowupper;i++)
			{
				System.out.print(matrix[i][colupper]);
			}
			colupper--;
			for(int i=colupper;i>=collower;i--)
			{
				System.out.print(matrix[rowupper][i]);
			}
			rowupper--;
			for(int i=rowupper;i>=rowlower;i--)
			{
				System.out.print(matrix[i][collower]);
			}
			collower++;
		}
	}
	public static void main(String[]args)
	{
		int matrix[][]= {{1,2,3,4,5},
				         {6,7,8,9,10},
				         {11,12,13,14,15},
				         {16,17,18,19,20},
				         {21,22,23,24,25}};
		spiralPrint(matrix);
	}
}
	