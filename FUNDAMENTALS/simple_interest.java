package fundamentals;
import java.util.Scanner;

public class simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int p = s.nextInt();
		double r = s.nextDouble();
		int t = s.nextInt();
		int S_I = (int)(p*r*t)/100;
		System.out.println(S_I);
		s.close();

		

	}

}
