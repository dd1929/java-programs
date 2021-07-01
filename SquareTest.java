import java.util.Scanner;

public class SquareTest {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner number = new Scanner(System.in);
		double n = number.nextDouble();
		double square = Math.pow(n, 2);
		System.out.println("The square of " + n + " is " + square);
	}
}