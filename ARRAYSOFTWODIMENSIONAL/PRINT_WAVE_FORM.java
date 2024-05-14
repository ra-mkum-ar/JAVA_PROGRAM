package ARRAYSOFTWODIMENSIONAL;

public class PRINT_WAVE_FORM {
	
	public static void PrintWave(int mat[][])
	{
		
		int nrows=mat.length;
		if(nrows==0)
		{
			return;
		}
		int rowstart=0;
		int ncols=mat[0].length-1;
		int colstart=0;
		int count=0;
		int totalsum=nrows*ncols;
		while(count<totalsum)
		{
			for(int i=rowstart;i<=nrows-1;i++)
			{
				System.out.print(mat[i][colstart]+" ");
				count++;
			}
			colstart++;
			for(int i=nrows-1;i>=rowstart;i--)
			{
				System.out.print(mat[i][colstart]+" ");
				count++;
			}
			colstart++;
			
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int mat[][]= {{10,20,30,40},
				     {50,60,70,80},
				     {90,100,110,120}};
		PrintWave(mat);

	}

}
