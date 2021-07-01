import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10);
		System.out.println("I have chosen a number from 0 to 9. Guess it.");
		Scanner guess = new Scanner(System.in);
		int g = guess.nextInt();
		for (g = g; g != n; g = g){
			if(g > 9){
				System.out.println("The entered number is not valid. Try again.");
			}
			else if(g > n){
				System.out.println("My number is less than that.Try again.");
			}
			else if(g < n){
				System.out.println("My number is greater than that. Try again.");
			}
			Scanner guess2 = new Scanner(System.in);
			g = guess2.nextInt();
		}
			System.out.println("Congratulations! You've got it right.");
	}
}