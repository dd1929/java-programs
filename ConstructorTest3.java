import java.util.Scanner;

public class Coronavirus{
	int number;
	
	Coronavirus(){
		number = number;
	}
	Coronavirus(int num) {
		this.setNumber(num);
	}
	public void setNumber(int x){
		number = x;
	}
	public int getNumber(){
		return number;
	}
}

class ConstructorTest {
	public static void main(String[] args){
		Coronavirus covid19 = new Coronavirus();
		System.out.println(covid19.getNumber() + " have died of COVID-19 in total.");
		System.out.println("How many people in the world have died of COVID-19 in total?");
		Scanner n = new Scanner(System.in);
		int c = n.nextInt();
		Coronavirus covid = new Coronavirus(c);
		System.out.println("Ok. So " + covid.getNumber() + " have died of COVID-19 in total.");
	}
}