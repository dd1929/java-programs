import java.util.Scanner;

public class PACalculator {
	public static void rect(double x, double y){
		double perimeter = 2*(x + y);
		double area = x*y;
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The area is "+ area);
	}
	
	public static void sqr(double s){
		double perimeter = 4*s;
		double area = Math.pow(s, 2);
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The area is " + area);
	}
	
	public static void circle(double r){
		double circumference = 2*22.0/7.0*r;
		double area = 22.0/7.0*r*r;
		System.out.println("The circumference is " + circumference);
		System.out.println("The area is " + area);
	}
	
	public static void triangle(double s1, double s2, double s3, double h){
		double perimeter = s1 + s2 + s3;
		double area = s1*h/2.0;
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The area is " + area);
	}
	
	public static void main(String[] args) {
		System.out.println("Which shape's perimeter and area do you need (Triangle, Square, Rectangle or Circle) ?");
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		if(b.equals("rectangle") || b.equals("Rectangle")){
			System.out.println("Enter dimensions (only numeral part): ");
			System.out.println("Enter length:");
			Scanner length = new Scanner(System.in);
			double l = length.nextDouble();
			System.out.println("Enter breadth:");
			Scanner width = new Scanner(System.in);
			double w = width.nextDouble();
			rect(l, w);
		}
		else if(b.equals("square") || b.equals("Square")){
			System.out.println("Enter side:");
			Scanner side = new Scanner(System.in);
			double s = side.nextDouble();
			sqr(s);
		}
		else if(b.equals("circle") || b.equals("Circle")){
			System.out.println("Enter radius:");
			Scanner radius = new Scanner(System.in);
			double r = radius.nextDouble();
			circle(r);
		}
		else if(b.equals("triangle") || b.equals("Triangle")){
			System.out.println("Enter first side / base:");
			Scanner side1 = new Scanner(System.in);
			double s1 = side1.nextDouble();
			System.out.println("Enter second side:");
			Scanner side2 = new Scanner(System.in);
			double s2 = side2.nextDouble();
			System.out.println("Enter third side:");
			Scanner side3 = new Scanner(System.in);
			double s3 = side3.nextDouble();
			System.out.println("Enter height");
			Scanner height = new Scanner(System.in);
			double h = height.nextDouble();
			triangle(s1, s2, s3, h);
		}
		else{
			System.out.println("It is not possible to operate on the provided value. Please check if you have entered a correct value and retry.");
		}
	}
}