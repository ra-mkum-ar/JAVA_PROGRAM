package ARRAYS_2;
import java.util.Scanner;
public class EXTRA_CANDIES {
	public static int[] extraCandies(int arr1[],int arr2[],int n , int x)
	{
		long carry=0;
		int ans[]= new int[n];
		for(int i=0;i<n;i++)
		{
			long total=arr1[i]+arr2[i]+carry;
			carry=0;
		
		if(total<=x)
		{
			ans[i]=(int)total;
		}
		else
		{
			carry=total-x;
			ans[i]=x;
		}
	}
	return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int x = sr.nextInt();
    	    int arr1[] = new int[n];
    	    int arr2[] = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        arr1[i] = sr.nextInt();
    	    }
    	    
    	    for(int i=0;i<n;i++)
    	    {
    	        arr2[i] = sr.nextInt();
    	    }
    	    int answer[] = new int[n]; //creating the answer array
    	    answer = extraCandies(arr1,arr2,n,x);
    	    for(int i = 0 ;i < n ;i++)
    	    {
    	        System.out.print(answer[i]+" ");
    	    }
    	    System.out.println();
    	    t = t-1;
	    }
	    sr.close();
	}

	}


