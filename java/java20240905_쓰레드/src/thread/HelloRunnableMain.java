package thread;

public class HelloRunnableMain  {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "main() start");
		
		HelloThread hellothread = new HelloThread();

		System.out.println(Thread.currentThread().getName() + " start() 호출 전");
		hellothread.start();
		System.out.println(Thread.currentThread().getName() + " start() 호출 후");
		
		System.out.println(Thread.currentThread().getName() + "main() end");
	}
}
