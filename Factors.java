import java.util.Scanner;

public class Factors{
	public static void main(String [ ] args){
		System.out.println("Enter the number whose factors you want: ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		System.out.println("Factors:");
		for (int c = 1; c <= b; c++){
			if(b%c == 0 ){
				System.out.println(c);
			}
		}
	}
}