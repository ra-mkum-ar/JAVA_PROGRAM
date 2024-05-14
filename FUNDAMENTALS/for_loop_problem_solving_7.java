package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_7 {
public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int n =s.nextInt();
	int output=0;
	while(output*output<=n)
	{
		output=output+1;
	}
	output=output-1;
	System.out.println(output);
	s.close();
}
}
