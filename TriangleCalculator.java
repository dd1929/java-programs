import java.util.Scanner;

public class TriangleCalculator {
	public static void main(String[] args) {
		System.out.println("Enter base:");
		Scanner base = new Scanner(System.in);
		double b = base.nextDouble();
		System.out.println("Enter second side:");
		Scanner side2 = new Scanner(System.in);
		double s2 = side2.nextDouble();
		System.out.println("Enter third side:");
		Scanner side3 = new Scanner(System.in);
		double s3 = side3.nextDouble();
		System.out.println("Enter height:");
		Scanner height = new Scanner(System.in);
		double h = height.nextDouble();
		double perimeter = b + s2 + s3;
		double area = b/2.0*h;
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The area is " + area);
	}
}