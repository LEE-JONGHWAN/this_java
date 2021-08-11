package sec06_throws;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			// clazz ??
			Object obj = clazz;
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	static Class clazz = null;
	
	public static void findClass() throws ClassNotFoundException {
		clazz = Class.forName("com.jbpark.dabang.module.AddressMan");
		return;
	}
}

