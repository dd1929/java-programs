import java.util.*;

class NameCompile extends Thread (String fn, String ln){
	public void run(String fn, String ln) {
		System.out.println("Your name is " + fn + " " + ln + ".");
	}
}

class AgeCompile extends Thread (int age, String dob){
	public void run(int age, String dob){
		System.out.println("You were born on " + dob + " and you are now " + age + " years old.");
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String fn = sc.nextLine();
		System.out.println("Enter your last name:");
		String ln = sc.nextLine();
		System.out.println("Enter your age in years:");
		int age = sc.nextInt();
		System.out.println("Enter your date of birth:");
		String dob = sc.nextLine();
		NameCompile a = new NameCompile(fn, ln);
		AgeCompile b = new AgeCompile(age, dob);
		a.start();
		b.start();
	}
}