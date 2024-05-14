package ARRAYSOFTWODIMENSIONAL;
import java.util.Scanner;
public class QUERY_AND_MATRIX {
	
	public static int[] query(int[][] mat, int m, int n, String[] q) 
	{
       int k=0;
       for(int i=0;i<q.length;i++)
       {
    	   String query = q[i];
    	   int queryType = query.charAt(0)-'0';
    	   if(queryType==2)
    	   {
    		   k++;
    	   }
       }
       int result[]=new int[k];
       int j=0;
       for(int i=0;i<q.length;i++)
       {
    	   String query=q[i];
    	   int queryType=query.charAt(0)-'0';
    	   char dimension = query.charAt(1);
    	   int index = query.charAt(2)-'0';
    	   if(queryType==1)
    	   {
    		   if(dimension=='R')
    		   {
    			   fliprow(mat,index,m);
    		   }
    		   else if(dimension=='C')
    		   {
    			   flipcolumn(mat,index,n);
    		   }
    	   }
    	   else if(queryType==2)
    	   {
    		   int count=0;
    		   if(dimension=='R')
    		   {
    			   count=CountZeroInRows(mat,index,m);
    			   
    		   }
    		   else if(dimension=='C')
    		   {
    			   count=CountZeroInColumns(mat,index,n);
    			   
    		   }
    		   result[j]=count;
    		   j++;
    		   
    	   }
    	       	   
       }
       return result;
    }
	public static void fliprow(int matrix[][],int Rowindex,int n)
	{
		for(int i=0;i<n;i++)
		{
			matrix[Rowindex][i]^=1;
		}
	}
	public static void flipcolumn(int matrix[][],int Colindex,int m)
	{
		for(int i=0;i<m;i++)
		{
			matrix[i][Colindex]^=1;
		}
	}
	public static int CountZeroInRows(int matrix[][],int Rowindex,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(matrix[Rowindex][i]==0)
			{
				count++;
			}
		}
		return count;
	}
	public static int CountZeroInColumns(int matrix[][],int Colindex,int m)
	{
		int count=0;
		for(int i=0;i<m;i++)
		{
			if(matrix[i][Colindex]==0)
			{
				count++;
			}
		}
		return count;
	}
	


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int[][] matrix = new int[M][N];
            int Q = scanner.nextInt();
            scanner.nextLine();// To read the current and previous input

            String[] queries = new String[Q];
            for (int i = 0; i < Q; i++) {
                queries[i] = scanner.nextLine();
            }

            int[] result = query(matrix, M, N, queries);

            for (int count : result) {
                System.out.print(count+" ");
            }
            System.out.println();
        }


        scanner.close();

	}

}

//2
//3 3
//3
//1R1
//1R2
//2C1
//2 2
//1
//2R1
