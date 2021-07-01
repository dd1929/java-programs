import java.util.Scanner;

class ReferenceTest {
	public static void main(String[] args) {
		Scanner n = new Scanner;
		String name = n.nextLine();
		Person boy;
		boy = new Person(name);
		hello(name);
		int age = this.setAge()



	}
	public static void hello(Person p) {
		System.out.println("Hello! " + p);
		p.setAge
	}
}

public class Person {
	String n;
	int a;
	Person (String w) {
		this.n = w
	}
	public void setAge(int i){
		a = i;
	}
	public int getAge(){
		return a;
	}
}