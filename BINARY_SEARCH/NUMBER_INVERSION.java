package BINARY_SEARCH;
import java.util.Scanner;
public class NUMBER_INVERSION {
	
	public static int getInversions(int[] arr, int n) {
        {
            int inversions=0;
            for(int i=0;i<n-1;i++)
            {
                int min_idx=i;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]<arr[min_idx]){
                        min_idx=j;
                    }
                }
                inversions+=(min_idx-i);
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
            return inversions;
            }
        }
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int result = getInversions(arr, n);
        System.out.print(result);
        s.close();
    }
	
}

	