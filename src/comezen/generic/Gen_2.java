package comezen.generic;

public class Gen_2<T, H> {
	// 형 변수 2개 선언.
	private T name;
	private H level;
	
	// 생성자.
	public Gen_2(T name, H level) { 
		this.name = name;
		this.level = level;
	}
	

	public static void main(String[] args) {
		var gen_1 = new Gen_2<String, Integer>("특가상품", 15);
		System.out.println(gen_1.name + " 받기 위해서는 앞으로 " 
				+ gen_1.level + " 장이 필요합니다." );
		
	}
}