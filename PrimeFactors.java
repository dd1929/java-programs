import java.util.Scanner;

public class PrimeTest {
	protected static boolean primetest = true;
	private static int y;
	public static void prime(int x) {
		for (y = 2; y < x; y++) {
			if (x % y == 0) {
				primetest = false;
				break;
			}
		}
	}
}
class PrimeFactorizer extends PrimeTest {
	public static void primefactor(int i) {
		for (int j = 2; j <= i; j ++){
			while (i%j == 0){
				PrimeTest.prime(j);
				if (PrimeTest.primetest == true){
					System.out.println(j);
					i = i/j;
				}
			}
		}
	}
}
class PrimeFactorTest {
	static public void main(String[] args){
		System.out.println("Enter number:");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		System.out.println("Prime Factors:");
		PrimeFactorizer.primefactor(n);
	}
}