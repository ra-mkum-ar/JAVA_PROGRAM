package ARRAYS_2;
import java.util.Scanner;
public class MOVE_ALL_NEGATIVE_NUMBERS 
{
	public static int[] separate(int arr[])
	{
		int n=arr.length;
		int ans[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				ans[k++]=arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=0)
			{
				ans[k++]=arr[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) 
	{
	    Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar[] = new int[n];
    	    for(int i = 0 ; i<n ;i++)
    	    {
    	        ar[i] = sr.nextInt();
    	    }
    	    ar = separate(ar);
    	    int index=-1;
    	    for(int i=0;i<n;i++)
    	    {
    	        if(ar[i]>=0)
    	        {
    	            index = i;
    	            break;
    	        }
    	    }
            if(index ==-1)
            {
                System.out.print("Yes");
            }
            else
            {
                int flag=0;
                for(int i= index+1;i<n;i++)
                {
                    if(ar[i]<0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            
    	    t = t-1;
	    }
	    sr.close();
	}
}
	