import java.util.Scanner;

public class Factorial {
	public static void factorial(double x){
		double factorial = 1;
		for(double y = x; y > 0; y--){
			factorial *= y;
		}
		System.out.println("Factorial: "+factorial);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner a = new Scanner(System.in);
		double n = a.nextDouble();
		factorial(n);
	}
}