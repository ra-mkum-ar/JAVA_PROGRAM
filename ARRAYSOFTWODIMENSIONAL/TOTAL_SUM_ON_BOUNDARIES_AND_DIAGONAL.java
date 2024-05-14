package ARRAYSOFTWODIMENSIONAL;

public class TOTAL_SUM_ON_BOUNDARIES_AND_DIAGONAL 
{
	public static void totalSum(int[][] mat) 
    {
		//Your code goes here
        int N=mat.length;
        int sum=0;
        // top row && bottom row
        for(int i=0;i<N;i++)
        {
            sum+=mat[0][i];
            sum+=mat[N-1][i];
        }
        // left column && right column
        for(int i=1;i<N-1;i++)
        {
            sum+=mat[i][0];
            sum+=mat[i][N-1];
        }
        // left diagonal and right diagonal
        for(int i=1;i<N-1;i++)
        {
            sum+=mat[i][i];
            sum+=mat[i][N-1-i];
        }
        if(N%2!=0)
        {
            sum-=mat[N/2][N/2];
        }
        System.out.print(sum);
	}

	public static void main(String[]args)
	{
		int matrix[][]= {{1,2,3,4,5},
				         {6,7,8,9,10},
				         {11,12,13,14,15},
				         {16,17,18,19,20},
				         {21,22,23,24,25}};
		totalSum(matrix);
	}
}
	