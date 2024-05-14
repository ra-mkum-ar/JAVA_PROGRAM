package ARRAYSOFTWODIMENSIONAL;
import java.util.Scanner;
public class INPUT_SCANNER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int arr[][] = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the elements of "+i+"row"+j+"col");
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		s.close();
		

	}

}
