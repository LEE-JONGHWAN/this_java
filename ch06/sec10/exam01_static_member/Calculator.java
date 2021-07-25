package sec10.exam01_static_member;

public class Calculator {
	private static Calculator calculator = null;
	private Calculator() {
		System.out.println("constructor called");
	}
	public static Calculator getCalculator() {
		if(calculator == null) {
			calculator = new Calculator();
		}
		return calculator;
	}
	
	static double pi = 3.14159;
	
	int plus(int x, int y) {
		return x + y;
	}
	
	 int minus(int x, int y) {
		return x - y;
	}
}

