class HelloWorld implements Runnable {
	public void run(){
		System.out.println("Hello World!");
	}
}

class HowAreYou implements Runnable {
	public void run(){
		System.out.println("How Are You?");
	}
}

class IAmFine implements Runnable {
	public void run(){
		System.out.println("I Am Fine.");
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Thread hw = new Thread(new HelloWorld());
		Thread hay = new Thread(new HowAreYou());
		Thread iaf = new Thread(new IAmFine());
		hay.setPriority(1);
		iaf.setPriority(2);
		hw.setPriority(3);
		iaf.start();
		hay.start();
		hw.start();
	}
}
//The Runnable is an interface which allows us to create threads. It may seem that implementing the Runnable interface is a bit more complex than extending from the Thread class. However, implementing the Runnable interface is the preferred way to start a Thread, because it enables us to extend from another class, as well.