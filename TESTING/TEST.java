package TESTING;

public class TEST {
	 int a; 
     int b; 
     int temp;

 public void set(int a, int b) 
 {  
     temp = a; 
     this.temp = a;
     a = b;
     this.a =b;
     b = temp;
     this.b = temp;

 } 

 void display() 
 { 
     System.out.println("a=" + a + " b=" + b); 
 } 


}
