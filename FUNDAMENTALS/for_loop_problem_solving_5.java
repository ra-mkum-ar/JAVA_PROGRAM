package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_5 {
public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int decimal=0;
	int place_value=1;
	while(n>0)
	{
		int lastdigit=n%10;
		decimal=decimal+lastdigit*place_value;
		place_value=place_value*2;
		n/=10;
		
	}
	System.out.println(decimal);
	s.close();
}
}
