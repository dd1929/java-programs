import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		try{
		ArrayList<Integer> mathmarks = new ArrayList<Integer>(3);
		System.out.println(mathmarks.size());
		mathmarks.add(50);
		mathmarks.add(78);
		mathmarks.add(47);
		mathmarks.add(75);
		mathmarks.add(10);
		mathmarks.add(9);
		mathmarks.add(8);
		mathmarks.remove(0);
		System.out.println(mathmarks);
		Iterator<Integer>a = mathmarks.iterator();
		while (a.hasNext()){
			System.out.println(a.next());
		}
		System.out.println(mathmarks.size());
		System.out.println(mathmarks.contains(52));
		System.out.println(mathmarks.contains(78));
		System.out.println(mathmarks.get(2));
		Collections.sort(mathmarks);
		System.out.println(mathmarks);
		System.out.println(Collections.min(mathmarks));
		System.out.println(Collections.max(mathmarks));
		Collections.reverse(mathmarks);
		System.out.println(mathmarks);
		Collections.shuffle(mathmarks);
		System.out.println(mathmarks);
		mathmarks.clear();
		System.out.println(mathmarks);
		System.out.println(mathmarks.size());
		System.out.println(mathmarks.contains(52));
		System.out.println(mathmarks.contains(78));
		System.out.println(mathmarks.get(2));
		}catch (Exception e){
			System.out.println("Error");
		}
	}
}