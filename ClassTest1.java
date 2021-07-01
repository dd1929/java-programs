public class Hello{
	static void hello(){
		System.out.println("Hello World");
	}
}
 class Test{
	public static void main(String[] args){
		Hello man = new Hello();
		man.hello();
	}
}