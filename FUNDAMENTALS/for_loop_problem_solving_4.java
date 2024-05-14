package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_4 {
public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int count=1;
	int i=1;
	for(;count<=n;)
	{
		
		int x= 3*i+2;
		if((x%4!=0))
		{
			System.out.print(x+" ");
			count++;
		}
		i++;
	}
	s.close();
}
}
