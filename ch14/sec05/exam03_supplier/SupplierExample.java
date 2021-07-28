package sec05.exam03_supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier 주사위값 = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		System.out.println("눈의 수: " + 주사위값.getAsInt());
	}
}
