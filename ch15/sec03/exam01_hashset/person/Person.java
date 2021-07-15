package sec03.exam01_hashset.person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Person {
	
	private String name;
	private HashSet<String> wishes;
	
	public Person(String name, String...wishes) {
		this.name = name;
		String[] locWishes =  wishes;
		this.wishes = new HashSet<String>(Arrays.asList(wishes)); 
	}
	
	
	// 차집합 교집합 합집합
	public static void main(String...strings) {
		Person a = new Person("종식A", "지혜", "돈", "명예");
		Person b = new Person("종식B", "지혜", "사랑", "건강");
		Person c = new Person("종식C", "지혜", "건강", "경험");
		a.getWishes().addAll(b.getWishes());
		printContent("a",a);
		// a : 명예, 건강, 지혜, 돈, 사랑, 
		System.out.println();
		System.out.println();
		
		b.getWishes().removeAll(c.getWishes());
		printContent("b",b); //차집합
		// b : 사랑, 
		System.out.println();
		System.out.println();

		printContent("a",a);
		printContent("c",c);
		a.getWishes().retainAll(c.getWishes());
		printContent("a",a); //교집합
		// c : 건강, 지혜, 
	}

	private static void printContent(String pName, Person a) {
		System.out.println(pName + ": ");
		a.getWishes().stream().map(w -> w + ", ") //합집합
		.forEach(System.out::print);
		System.out.println();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashSet<String> getWishes() {
		return wishes;
	}
	public void setWishes(HashSet<String> wishes) {
		this.wishes = wishes;
	}
}
