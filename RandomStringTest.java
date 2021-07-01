import java.util.Scanner;
import java.util.Random;

public class RandomStringTest {
	public static void main(String[] args) {
		String [] test = {"Heads", "Tails"};
		Random random = new Random();
		String r = test[random.nextInt(2)];
		System.out.println(r);
	}
}