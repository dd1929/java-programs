class HelloWorld extends Thread {
	public void run(){
		System.out.println("Hello World!");
	}
}

class HowAreYou extends Thread {
	public void run(){
		System.out.println("How Are You?");
	}
}

class IAmFine extends Thread {
	public void run(){
		System.out.println("I Am Fine.");
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		try{
		HelloWorld hw = new HelloWorld();
		HowAreYou hay = new HowAreYou();
		IAmFine iaf = new IAmFine();
		hay.setPriority(1);
		iaf.setPriority(2);
		hw.setPriority(3);
		iaf.start();
		Thread.sleep(1000);
		hay.start();
		Thread.sleep(1000);
		hw.start();
		} catch (Exception e){
		}
	}
}
//The Thread class is a class that allows us to run actions in our program in parallel on different threads.