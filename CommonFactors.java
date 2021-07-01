import java.util.Scanner;

public class CommonFactors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Common factors :");
		int y;
		if (a > b){
			y = b;
		}
		else if(a < b){
			y = a;
		}
		else{
			y = a;
		}
		
		for(int x = 2; x <= y; x++){
			if(a%x == 0){
				if (b%x == 0){
					System.out.println(x);
				}
			}
		}
	}
}