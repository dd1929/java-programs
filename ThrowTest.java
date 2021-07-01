import java.util.*;

public class ThrowTest{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter dividend:");
		int val1 = a.nextInt();
		System.out.println("Enter divisor:");
		int val2 = a.nextInt();
		int ans = div(val1, val2);
		System.out.println("Quotient:" + ans);
	}
	public static int div(int val1, int val2) throws ArithmeticException {
		if(val2 == 0){
			throw new ArithmeticException("Division by zero is not valid.");
		}else{
			return val1/val2;
		}
	}
}