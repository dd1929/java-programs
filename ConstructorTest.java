import java.util.Scanner;

public class Day {
	String day;
	Day() {
		day = "Monday";
	}
	Day(String word){
		this.setDay(word);
	}
	public void setDay(String w){
		day = w;
	}
	public String getDay(){
		return day;
	}
}
class ConstructorTest {
	public static void main(String[] args) {
		System.out.println("What day do you think it is today?");
		Scanner d = new Scanner(System.in);
		String day1 = d.next();
		Day d2 = new Day();
		Day d1 = new Day(day1);
		System.out.println(d1.getDay());
		System.out.println("Today is " + d2.getDay() + " ☺");
	}
}