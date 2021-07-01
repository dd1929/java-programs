import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		int w;
		int z = 1;
		System.out.println("Enter a number: ");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		for(int m = 2; m <= n; m++){
			while (n%m == 0){
				for (int y = 1; y <= m; y++){
					if (m%y == 0 && (y != 1 && y != m)){
						z = m;
					}
				}
				if (z == 1){
					System.out.println(m);
					n = n/m;
				}
			}
		}
	}
}