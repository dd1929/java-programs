import java.util.Scanner;
import java.util.Random;

public class CoinToss {
	public static void main(String[] args) {
		System.out.println("How many times do you want to toss a coin ?");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		String [] ht = {"Heads", "Tails"};
		String [] times = new String[n];
		for(int x = 1; x <= n; x++){
			Random random = new Random();
			int toss = random.nextInt(2);
			System.out.println("Toss " + x + " : " +ht[toss]);
			times [x - 1] = ht[toss];
		}
		if(n != 1){
			System.out.println("Results:");
		}
		else if(n == 1){
			System.out.println("Result:");
		}
		for(int y = 1; y <= n; y++){
			System.out.println(times [y - 1]);
		}
	}
}