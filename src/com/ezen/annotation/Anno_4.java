package com.ezen.annotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Anno_4 {
    private Long id; // will be set when persisting

    private String firstName;
    private String lastName;
    private int age;
	public static void main(String[] args) {
		var leader = new Anno_4();
		leader.setLastName("김");
	}

}
