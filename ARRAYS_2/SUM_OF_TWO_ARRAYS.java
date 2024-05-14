package ARRAYS_2;

public class SUM_OF_TWO_ARRAYS 
{
	public static void sumofTwoArrays(int arr1[],int arr2[],int output[])
	{
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		int k=Math.max(arr1.length,arr2.length);
		while(i>=0 && j>=0)
		{
			int sum=arr1[i]+arr2[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			i-=1;
			j-=1;
			k-=1;
		}
		while(i>=0)
		{
			int sum=arr1[i]+carry;
			output[k]=sum%10;
			carry=sum/10;
			i-=1;
			k-=1;
		}
		while(j>=0)
		{
			int sum=arr1[i]+arr2[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			j-=1;
			k-=1;
		}
		output[0]=carry;
	}

	 public static void printArray(int arr[]){
	        for(int i=0;i<arr.length;i++)
	        {
	          System.out.print(arr[i]+" ");

	        }
	    }
	    public static void main(String[] args) {
	        int arr1[] = {1, 9, 8, 7, 6,5};
	        int arr2[] = {2, 9, 1, 0 ,9};
	        int output[] = new int[Math.max(arr1.length, arr2.length)+1];
	        //length of output array is maximum of array1 and array2 plus 1.
	        sumofTwoArrays(arr1, arr2, output);
	        printArray(output);
	    }    
	}
