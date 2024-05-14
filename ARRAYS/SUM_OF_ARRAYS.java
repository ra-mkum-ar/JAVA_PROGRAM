package ARRAYS;
import java.util.Scanner;
public class SUM_OF_ARRAYS {
	public static int Sum(int[]arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans+=arr[i];
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		    int t=s.nextInt();
		    while(t>0)
		    {
		        int n = s.nextInt();
		        int arr[]=new int[n];
		        for(int i=0;i<n;i++)
		        {
		            System.out.println("Entered the element"+i+"index");
		            arr[i]=s.nextInt();
		        }
		        int result=Sum(arr);
		        System.out.println(result);
		    }
		    s.close();
			
		}


	}


