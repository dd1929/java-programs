import java.util.*;

public class ArrayListTest {
    public static void main(String[ ] args) {
            
	    ArrayList<Human> students= new ArrayList<Human>();
	    Human a = new Human(14,"Deepto");
	    Human b = new Human(13,"Sourav");
	    students.add(a);
	    students.add(b);
		System.out.println(students.get(1).age);
		System.out.println(students.get(0).name);
    }
}

class Human { 
  int age;
  String name;
  Human(int age, String name){
  this.age = age;
  this.name = name;
      
  }
}