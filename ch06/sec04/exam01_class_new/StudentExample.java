package sec04.exam01_class_new;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.changeName("철수");
		System.out.println(s1.giveName() + " 가 등록했습니다.");
		
		s1 = new Student();
		s1.changeName("영희");
		System.out.println(s1.giveName() + " 가 등록했습니다.");
	}
}

