package verify.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "홍길동"));
		set.add(new Student(1, "조민우"));
		
		Iterator<Student> iterator = set.stream()
			.map(set ->
				set.studentNum + "student" + set.name)
			.forEach(System.out::print);
		
//		while(iterator.hasNext()) {
//			Student student = iterator.next();
//			System.out.println(student.studentNum + ":" + student.name);
//		}
	}
}
