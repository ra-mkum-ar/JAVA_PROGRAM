package fundamentals;
import java.util.Scanner;

public class for_loop_problem_solving_3 {
public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i=2;i<=n;i++){
        boolean isPrime = true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(i);
        }
			
		}
		
	s.close();
}
}
