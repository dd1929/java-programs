import java.util.Scanner;

public class SquareCalculator {
	public static void main(String[] args) {
		System.out.println("Enter side:");
		Scanner side = new Scanner(System.in);
		double s = side.nextDouble();
		double perimeter = 4*s;
		double area = s*s;
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The area is " + area);
	}
}