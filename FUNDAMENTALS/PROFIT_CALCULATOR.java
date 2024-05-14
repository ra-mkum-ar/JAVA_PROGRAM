package fundamentals;
import java.util.Scanner;

public class PROFIT_CALCULATOR {
	public static void main(String[]args)
	{
			Scanner s = new Scanner(System.in);
	        int basic = s.nextInt();
	        char grade = s.next().charAt(0);
	        double hra =(0.2d*basic);
	        double da=(0.5*basic);
	        int allow =1300;
	        if(grade=='A')
	        {
	            allow=1700;
	        }
	        else if(grade=='B')
	        {
	            allow=1500;
	        }
	        double pf=(0.11d*basic);
	        double total_salary=basic+hra+da+allow-pf;
	        System.out.println(Math.round(total_salary));
	        s.close();

	}
	
}
