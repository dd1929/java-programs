import java.util.Scanner;

public class MyCalculator {
	public static void main(String[] args) {
		System.out.println("Enter first number:");
		Scanner a = new Scanner(System.in);
		double x, y;
		x = a.nextDouble();
		System.out.println("Enter second number:");
		Scanner b = new Scanner(System.in);
		y = b.nextDouble();
		double sum = x + y;
		double diff = x - y;
		double product = x * y;
		double div = x / y;
		System.out.println("Addition: "+ sum);
		System.out.println("Subtraction: " + diff);
		System.out.println("Multiplication: " + product);
		System.out.println("Division: " + div);
	}
}