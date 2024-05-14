package fundamentals;
import java.util.Scanner;

public class SUM_OF_ODD_AND_EVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int odd=0,even=0,rem = 0,r=0;
		int i=1;
		while(i<n)
		{
			r =r*100+rem;
			rem= n%100;
			n/=100;
			if(r%2==0)
			{
				even=even+r;
			}
			else{
				odd=odd+r;
			}
		}
		System.out.println(even+" "+odd);
		s.close();


	}

}
