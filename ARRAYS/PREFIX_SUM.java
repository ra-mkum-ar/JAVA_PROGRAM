package ARRAYS;
import java.util.Scanner;
public class PREFIX_SUM {
	public static int[] calculatePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prefixSum[i] = sum;
        }

        return prefixSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the prefix sum array using the function
        int[] output = calculatePrefixSum(arr);

        // Print the output array
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }

        scanner.close();
    }
}