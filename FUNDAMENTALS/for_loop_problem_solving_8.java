package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_8 {
public static void main(String[] args) {
	try (Scanner s = new Scanner(System.in)) {
		int n = s.nextInt();
		int prev=s.nextInt();
		int curr,count=2;
		boolean isDec = true;
		while(count<=n)
		{
			curr=s.nextInt();
			count++;
			if(curr==prev)
			{
				System.out.println("false");
				return; 
			}
			if(curr<prev)
			{
				if(isDec==false)
				{
					System.out.println("false");
					return;
				}
			}
			else
			{
				if(isDec==true)
				{
					isDec=false;
				}
			}
			prev=curr;
		}
			System.out.println("true");
			s.close();
	}
}
}
    
   