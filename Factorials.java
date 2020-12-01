//Evan White
import java.util.Scanner;
public class Factorials {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long factorial = 1;
		int num1 = 0;
	
  System.out.println("Input a Number: " );
 
     if(input.hasNextInt())
 {
	 num1 = input.nextInt();
 }
     else
 {
	 System.out.println("Try another input");
	 input.close();
	 
	 return;
 }
 
     for(int i = 1; i <= num1; i++)
     {
	  factorial = factorial * i;
	  
  }
     System.out.println(factorial);
     System.out.println(" The For Loop : " +  factorial);
     
 factorial = 1;
 
while(num1 > 1)
{
	factorial = factorial * num1;
	
	num1 = num1 - 1;
}
 
 System.out.println(" The While Loop : " + factorial);
 
 do
 {
	 factorial = factorial* num1;
	 num1 = num1 -1;
 } while(num1 > 1);
 
 System.out.println(" The Do While Loop : " + factorial);
 
	}
}
/*
 Input a Number: 
6
720
 A For Loop : 720
 While Loop : 720
 Do While Loop : 720
*/
