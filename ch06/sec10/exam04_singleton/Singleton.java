package sec10.exam04_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public void doSomeWork() {
		return;
	}
	public static Singleton getInstance() {
		return singleton;
	}
}

