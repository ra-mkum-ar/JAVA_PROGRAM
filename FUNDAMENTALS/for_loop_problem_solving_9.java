package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_9 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	int n =scanner.nextInt();
	for(int i=1;i<=n;i++)
	{
		int x = scanner.nextInt();
    	int y = scanner.nextInt();
    	int gcd = findGCD(x, y);
   		System.out.println(gcd);
	}
	scanner.close();
   
}

public static int findGCD(int x, int y) {
    if (y == 0) {
        return x;
    }
    return findGCD(y, x % y);
}

}