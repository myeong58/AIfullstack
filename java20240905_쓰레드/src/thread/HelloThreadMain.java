package thread;

public class HelloThreadMain  {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "main() start");
		
		HelloRunnable hellothread = new HelloRunnable();
		Thread thread = new Thread(hellothread);

		thread.start();
		
		System.out.println(Thread.currentThread().getName() + "main() end");
	}
}
