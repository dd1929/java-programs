import java.util.Scanner;

public class ArrayAverage{
	public static void main (String [] args){
		System.out.println("How many numbers do you want to average ?");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		double [ ] avg = new double[b];
		for (int c = 1; c <= b; c++){
			System.out.println("Enter number: ");
			Scanner d = new Scanner(System.in);
			avg [c - 1] = d.nextDouble();
		}
		double sum = 0;
		for (int e = 0; e < avg.length; e++){
			sum += avg[e];
		}
		double num = sum/b;
		System.out.println("The average is: "+ num);
	}
}