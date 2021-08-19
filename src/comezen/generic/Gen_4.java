package comezen.generic;

public class Gen_4<T> {
	// 형 변수 선언.
	private T name;
	
	//setter 생성.
	public void setName(T name) { this.name = name; }
	
	//getter 생성.
	public T getName() {return name;}
	
	public static void main(String[] args) {
		
		// 여러 인자값 출력
		Gen_4<String> ge1 = new Gen_4<String>();
		Gen_4<Integer> ge2 = new Gen_4<Integer>();
		Gen_4<Double> ge3 = new Gen_4<Double>();
		
		ge1.setName("해밍웨이");
		ge2.setName(150000);
		ge3.setName(15.859);
		
		System.out.println("ge1의 데이터: " + ge1.getName());
		// 반환된  변수의 타입 출력
		System.out.println("ge1의 T 타입: " + ge1.getName().getClass().getName());
		
		System.out.println();
		
		System.out.println("ge2의 데이터: " + ge2.getName());
		// 반환된  변수의 타입 출력
		System.out.println("ge2의 T 타입: " + ge2.getName().getClass().getName());
		
		System.out.println();
		
		System.out.println("ge3의 데이터: " + ge3.getName());
		// 반환된  변수의 타입 출력
		System.out.println("ge3의 T 타입: " + ge3.getName().getClass().getName());
		
		System.out.println();

		
	}
}