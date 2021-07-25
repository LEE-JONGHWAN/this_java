package sec07.exam02_field_initialize;

public class KoreanExample {
	public static void main(String[] args) {
		한국인 k1 = new 한국인("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.rrn);
		
		한국인 k2 = new 한국인("김자바", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.rrn);
	}
}

