package sec10.exam02_static_block;

public class TelevisionExample {
	public static void main(String[] args) {
		System.out.println(Television.info);
		
		Demo obj1 = new Demo();
		System.out.println("For obj1:");
		obj1.printArray();
		Demo obj2 = new Demo();
		System.out.println("For obj2:");
		obj2.printArray();
	}
}
class Demo {
	static int[] numArray = new int[10];
	static {
		System.out.println("정적 초기화 블록");
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = (int) (100.0 * Math.random());
		}
	}
	void printArray() {
		System.out.println("초기화 결과 값");
		for(int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println();
	}
}

