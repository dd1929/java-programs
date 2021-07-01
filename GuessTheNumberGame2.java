import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a number. I will guess it");
		System.out.println("Enter the upper limit for your number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the lower limit for your number");
		int n2 = sc.nextInt();
		do{
			Random rndm = new Random();
			int i = rndm.nextInt(n1);
			System.out.println("Is your number" + i + " ? Answer with Y for Yes and N for No:")
			String str = sc.next();
		} while (str.)
		
	}
}