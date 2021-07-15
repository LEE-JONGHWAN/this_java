package sec05.exam03_comparable;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 90));
		treeSet.add(new Person("감자바", 110));
		treeSet.add(new Person("박지원", 31));
		
		treeSet.stream()
		.map(person -> person.getName() + "-" + person.getAge())
		.forEach(System.out::println);
		
	}
}
