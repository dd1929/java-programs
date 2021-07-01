import java.util.Scanner;

public class DoWhileTest{
	public static void main (String[] args){
		System.out.println("Enter your name:");
		Scanner n = new Scanner(System.in);
		String name = n.nextLine();
		System.out.println("How many times do you want your name to be printed out?");
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();
		int y = 1;
		do{
			System.out.println("Hello " + name + " !");
			y ++;
		}while(y <= x);
	}
}