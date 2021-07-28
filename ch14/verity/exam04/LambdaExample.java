package verity.exam04;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method(int x, int y) {
		int result2 = 10;
		IntSupplier supplier = () -> {
//			x *= 10;
//			int result = x + y;
			int result = x*result2 + y;
			return result;
		};
		int result3 = supplier.getAsInt();
		return result3;
	}
	
	public static void main(String[] args) {
		System.out.println(method(3,5));
	}
}
