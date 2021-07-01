import java.util.Scanner;

public class Primes {
	public static void primeTester(int x){
		int z = 1;
		if (x == 1){
			System.out.println("1 is neither prime nor composite.");
		}else {
			for (int y = 1; y <= x; y++){
				if (x%y == 0 && (y != 1 && y != x)){
					z = y;
				}
			}
			if (z == 1){
				System.out.println("The number is prime.");
			}
			else{
				System.out.println("The number is composite.");
			}
		}
	}
					
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		primeTester(n);
	}
}