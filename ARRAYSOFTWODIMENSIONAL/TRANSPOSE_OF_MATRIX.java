package ARRAYSOFTWODIMENSIONAL;

public class TRANSPOSE_OF_MATRIX {
	public static int[][] TransposeMatrix(int mat[][])
	{
		int m=mat.length;
		int n=mat[0].length;
		int mat1[][]=new int[n][m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat1[j][i]=mat[i][j];
			}
		}
		return mat1;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int mat[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12}};
		int result[][]=TransposeMatrix(mat);
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[0].length;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
