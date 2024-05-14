package TEST_1;
import java.util.Scanner;
public class GREATEST_COMMON_DIVISOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int temp,gcd;
			int num1=s.nextInt();
			int num2=s.nextInt();
			while(num2!=0)
			{
				temp=num2;
				num2=num1%num2;
				num1=temp;
			}
			gcd=num1;
			System.out.println(gcd);
		}
		s.close();
		

	}

}
