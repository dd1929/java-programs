import java.util.Scanner;

public class CubeRootTest {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner number = new Scanner(System.in);
		double n = number.nextDouble();
		double cbroot = Math.cbrt(n);
		System.out.println("The cube root of " + n + " is " + cbroot);
	}
}