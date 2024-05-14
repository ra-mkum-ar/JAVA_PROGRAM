package fundamentals;
import java.util.Scanner;

public class ODD_OR_EVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		s.close();
		

	}

}
