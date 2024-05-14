package fundamentals;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in);
			boolean result = false;
	        int number = s.nextInt();
	        int divisor = 2;
	        while(divisor<=number-1){
	            if(number%divisor==0){
	            	
	                System.out.print(divisor+" ");
	                result = true;
	            }
	            divisor++; 
	        }
	                 
	        if(result==false)
	        {
	           	System.out.println("-1");
	        }
	        s.close();
	        
	}

		   
	}


           
        	
           