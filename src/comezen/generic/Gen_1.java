package comezen.generic;

public class Gen_1<T> {
	// 형 변수 선언.
	private T name;
	
	// 생성자.
	public Gen_1(T name) { this.name = name;}
	
	// getter 로 받아오기.
	T getName() {return name;}

	public static void main(String[] args) {
		var gen_1 = new Gen_1<String>("자바갈증");
		System.out.println(gen_1.getName() + " 해소");
		
		var gen_2 = new Gen_1<Integer>(1);
		System.out.println("generic " + gen_2.getName() + "단계");
	}
}