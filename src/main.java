import java.util.Scanner;
/*
 * Author : WAFAA CHE ROSE
 * Description : A challenge I came across that have been bugging my mind.
 * A program to determine if a number input is a prime number, if it is print 'Prime Number',
 * otherwise print 'Not a prime number' and the lowest factor.    
 * 
 */

public class main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); // read number
		int num = in.nextInt();
		System.out.println(num); 
		// boolean pm = false; - not required since count is used
		int count = 0; // counter for prime number
		int lowestFact = 2; // usual lowest fact
		
		// divide number from 1 until the max(number input)
		for(int a = 1; a <= num; a++){
			if(num%a == 0){	 			
				//pm = true;
				count++; // increment if the number can be divided by more than 2 times
				if(count == 2){
					lowestFact =  a; 
				}
			}
			/*
			else{
				//pm = false;
			}*/
			//System.out.println(pm);
		}
		if(count > 2)System.out.println("Not a prime Number. Lowest factor is " + lowestFact);
		else System.out.println("Prime Number");
	}
	
}
