import java.util.Scanner;

public class CircleCalculator {
	public static void main(String[] args) {
		System.out.println("Enter radius:");
		Scanner radius = new Scanner(System.in);
		double r = radius.nextDouble();
		double circumference = 2.0*22.0/7.0*r;
		double area = 22.0/7.0*r*r;
		System.out.println("The circumference is " + circumference);
		System.out.println("The area is " + area);
	}
}