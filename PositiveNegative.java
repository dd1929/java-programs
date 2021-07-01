import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if (n > 0){
			System.out.println("The number is positive.");
		}
		else if(n == 0){
			System.out.println("0 is neither positive nor negative.");
		}
		else{
			System.out.println("The number is negative.");
		}
	}
}