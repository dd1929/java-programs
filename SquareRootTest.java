import java.util.Scanner;

public class SquareRootTest {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner number = new Scanner(System.in);
		double n = number.nextDouble();
		double root = Math.sqrt(n);
		System.out.println("The square root of " + n + " is " + root);
	}
}