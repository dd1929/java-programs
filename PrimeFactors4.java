import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number :");
         int number = sc.nextInt();
         int[] primeFactors = primeFactorize(number);
         for (int x : primeFactors){
         	System.out.println(x);
         }
	}
	
	private static int[] primeFactorize(int number){
		
		int[] primeFactors = {};
		
		for(int i = 2; i< number; i++) {
              while(number%i == 0) {
                  primeFactors[primeFactors.length] = i;
              	number = number/i;
        	 }
         }
         
        if (number > 2){
       	 primeFactors[primeFactors.length] = number;
        }
        
        return primeFactors;
	}
}