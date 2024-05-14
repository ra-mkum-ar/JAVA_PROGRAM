package TESTING_11;
import java.util.Scanner;
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		HELPER h = new HELPER();
		h.MULTIPLICATION(num1,num2);
		h.MULTIPLICATION(num1,num2,num3);
		
		s.close();
		

	}

}
