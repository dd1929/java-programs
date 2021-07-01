import java.util.Scanner;

public class RectangleCalculator {
	public static void main(String[] args) {
		System.out.println("Enter length:");
		Scanner length = new Scanner(System.in);
		double l = length.nextDouble();
		System.out.println("Enter breadth:");
		Scanner breadth = new Scanner(System.in);
		double b = breadth.nextDouble();
		double perimeter = 2*(l+b);
		double area = l*b;
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The area is "+ area);
	}
}