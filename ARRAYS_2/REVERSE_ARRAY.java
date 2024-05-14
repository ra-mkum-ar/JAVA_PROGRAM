package ARRAYS_2;
import java.util.Scanner;
public class REVERSE_ARRAY {
	
	public static int[] reverseBetween(int n, int l, int r,int arr[])
    {
        while (l <= r) {
            // Swap elements at indices l and r
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
	public static void main(String[] args) 
	{
	    Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
		    int n=sr.nextInt();
		    int ar[] = new int[n];
		    int l = sr.nextInt();
		    int r = sr.nextInt();
		    for(int i = 0 ; i<n ;i++)
		    {
		        ar[i] = sr.nextInt();
		    }
		    ar = reverseBetween(n, l, r, ar);
		    for(int i = 0 ;i < n ;i++)
		    {
		        System.out.print(ar[i]+" ");
		    }
		    System.out.println();
		    t = t-1;
	    }
	    sr.close();
	}
	}
