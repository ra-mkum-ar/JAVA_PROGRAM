package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_6 {
public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int binary=0;
	int place_value=1;
	while(n>0)
	{
		int lastdigit=n%2;
		binary=binary+lastdigit*place_value;
		place_value=place_value*10;
		n/=2;
		
	}
	System.out.println(binary);
	s.close();
}
}
