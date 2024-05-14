package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_2 {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int current=1;
		int previous=0;
		int next;
		for(int i=0;i<n;i++)
		{
			next=previous+current;
			previous=current;
			current=next;
		}
		System.out.println(previous);
		
	s.close();
}
}
