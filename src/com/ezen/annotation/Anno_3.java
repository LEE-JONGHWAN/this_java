package com.ezen.annotation;
import lombok.NonNull;

class Person {
	private String name = "홍길동";
	public String getName() {
		return name;
	}
}

public class Anno_3 {
	@SuppressWarnings("unused")
	private String name;
	
	public Anno_3(@NonNull Person person) {
		this.name = person.getName();
	}

	public static void main(String[] args) {
		var obj = new Anno_3(new Person());
	}
}
