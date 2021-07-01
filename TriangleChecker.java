import java.util.Scanner;

public class TriangleChecker {
	public static void main(String[] args) {
		System.out.println("Enter first side:");
		Scanner s1 = new Scanner(System.in);
		double a = s1.nextDouble();
		System.out.println("Enter second side:");
		Scanner s2 = new Scanner(System.in);
		double b = s2.nextDouble();
		System.out.println("Enter third side:");
		Scanner s3 = new Scanner(System.in);
		double c = s3.nextDouble();
		if(a + b <= c || a + c <= b || b + c <= a){
			System.out.println("The triangle is not possible.");
		}
		else{
			System.out.println("The triangle is possible");
		}
	}
}