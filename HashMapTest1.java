import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		try{
		HashMap<String, Integer> mathmarks = new HashMap<String, Integer>(3);
		System.out.println(mathmarks.size());
		mathmarks.put("Periodic Test-1", 50);
		mathmarks.put("Half Yearly", 78);
		mathmarks.put("Periodic Test-2", 47);
		mathmarks.put("Annual", 75);
		mathmarks.put("Class Test-1", 10);
		mathmarks.put("Class Test-2", 9);
		mathmarks.put("Class Test-3", 8);
		mathmarks.remove("Half Yearly");
		System.out.println(mathmarks);
		System.out.println(mathmarks.size());
		System.out.println(mathmarks.containsValue(52));
		System.out.println(mathmarks.containsKey("Annual"));
		System.out.println(mathmarks.get("Annual"));
		mathmarks.clear();
		System.out.println(mathmarks);
		System.out.println(mathmarks.size());
		System.out.println(mathmarks.containsValue(52));
		System.out.println(mathmarks.containsKey("Annual"));
		System.out.println(mathmarks.get(2));
		}catch (Exception e){
			System.out.println("Error");
		}
	}
}