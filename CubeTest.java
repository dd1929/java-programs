import java.util.Scanner;

public class CubeTest {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner number = new Scanner(System.in);
		double n = number.nextDouble();
		double cube = Math.pow(n, 3);
		System.out.println("The cube of " + n + " is " + cube);
	}
}