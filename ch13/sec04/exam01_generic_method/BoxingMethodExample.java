package sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		var box1 = Util.boxing(100);
		int intValue = box1.get();
		
		var box2 = Util.<String>boxing("홍길동");
		String strValue = box2.get();
		System.out.println(".");
	}
}
