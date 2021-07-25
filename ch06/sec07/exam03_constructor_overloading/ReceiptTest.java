package sec07.exam03_constructor_overloading;

public class ReceiptTest {

	public static void main(String[] args) {
		Receipt receipt = new Receipt("짜장면", 5, 3512);
		double price = receipt.getTotalPrice(-2);
		System.out.println(price);
		
	}

}
