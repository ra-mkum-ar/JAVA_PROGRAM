package BINARY_SEARCH;
import java.util.Scanner;
public class COUNT_SMALL {
	
	public static int[] countS(int n, int m, int a[],int b[])
    {
        int ans[]=new int[n];
        for(int idx=0;idx<n;idx++)
        {
            int lo=0,hi=m-1,cnt=0;
            while(lo<=hi)
            {
                int mid=(lo+hi)/2;
                if(b[mid]<=a[idx])
                {
                    cnt=mid+1;
                    lo=mid+1;
                }
                else
                {
                    hi=mid-1;
                }
            }
            ans[idx]=cnt;
        }
        return ans;
    }

	public static void main(String[] args) {
	
		 Scanner sr = new Scanner(System.in);
		    int t= sr.nextInt();
		    while(t > 0)
		    {
	    	    int n=sr.nextInt();
	    	    int a[] = new int[n];
	    	    for(int i = 0 ; i<n ;i++)
	    	    {
	    	        a[i] = sr.nextInt();
	    	    }
				int m = sr.nextInt();
				int b[] =new int[m];
	    	    for(int i=0;i<m;i++)
	    	    {
	    	        b[i]=sr.nextInt();
	    	    }
				int ans[] = new int[n];
				ans =countS(n, m, a, b);
				for(int i=0;i<n;i++)
				{
					System.out.print(ans[i]+" ");
				}
	    	    System.out.println();
	    	
	    	    t = t-1;
		    }
		    sr.close();
		}

	}

