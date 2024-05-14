package ARRAYS;
import java.util.Scanner;
public class LINEAR_SEARCH {

	public class Main 
	{
	    public static int LinearSearch(int arr[],int x)
	    {
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		if(arr[i]==x)
	    		{
	    			return i;
	    		}
	    	}
	    	return -1;
	    }

	    public static void main(String args[])
	    {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	    	int arr[] = new int[n];
	    	for(int i=0;i<n;i++)
	    	{
	    		
	    		arr[i]=s.nextInt();
	    	}
	    	int val=s.nextInt();
	        int search=LinearSearch(arr,val);
	        System.out.println(search);
	        s.close();
	    }
	}
}



