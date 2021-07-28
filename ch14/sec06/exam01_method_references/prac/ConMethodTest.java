package sec06.exam01_method_references.prac;

public class ConMethodTest {
	static <T> T maker(String name, int id, BinCon<T> creator) {
		return creator.generate(name, id);
	}
	
	public static void main(String[] args) {
		var studentHong = maker("홍길동", 100, Student::new);
		System.out.println(studentHong);
		var employeeKim = maker("김아무", 100, Employee::new);
		System.out.println(employeeKim);
	
	}

}
