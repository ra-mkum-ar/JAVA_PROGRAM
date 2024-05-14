package fundamentals;
import java.util.Scanner;

public class PROBLEM_SOLVING_6 {
	public static void main(String args[])
	{
		
				
		      Scanner s = new Scanner(System.in);
		      int start = s.nextInt();
		      int end = s.nextInt();
		      int step = s.nextInt();
		      int fahrenheitValue = start;
		      while(fahrenheitValue<=end) {
		    	  int celciusValue = (int)((5.0/9)*(fahrenheitValue-32));
		    	  System.out.println(fahrenheitValue+"\t"+celciusValue);
		    	  fahrenheitValue += step;
		    	  
		      }
		      s.close(); 
			}

		}


