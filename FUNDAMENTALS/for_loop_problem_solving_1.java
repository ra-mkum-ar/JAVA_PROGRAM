package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_1 {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	int c=s.nextInt();
	int sum=0;
	int product=1;
	if(c==1)
	{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			continue;
		}
		System.out.println(sum);
	}
	else if(c==2)
	{
		for(int i=1;i<=n;i++)
		{
			product=product*i;
			continue;
		}
		System.out.println(product);
	}
	else
	{
		System.out.println("-1");
	}
	s.close();
}
}
