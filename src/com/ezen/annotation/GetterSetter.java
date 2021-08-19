package com.ezen.annotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class GetterSetter {
	private String name;
	private Double salary;
	public GetterSetter(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) {
		var getterSetter = new GetterSetter();
		getterSetter = new GetterSetter("홍길동", 300.0);
		System.out.println(getterSetter);
	}
}
