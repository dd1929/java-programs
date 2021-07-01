import java.util.Scanner;

public class PythagoreanTriplets {
	public static void main(String[] args) {
		System.out.println("Enter first number:");
		Scanner n1 = new Scanner(System.in);
		double a = n1.nextDouble();
		System.out.println("Enter second number:");
		Scanner n2 = new Scanner(System.in);
		double b = n2.nextDouble();
		System.out.println("Enter third number:");
		Scanner n3 = new Scanner(System.in);
		double c = n3.nextDouble();
		if ((a*a) + (b*b) == (c*c)){
			System.out.println("It is a Pythagorean triplet.");
		}
		else{
			System.out.println("It is not a Pythagorean triplet.");
		}
	}
}