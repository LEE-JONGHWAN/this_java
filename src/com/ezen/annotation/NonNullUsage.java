package com.ezen.annotation;

import lombok.NonNull;

public class NonNullUsage {
	static void method(@NonNull String arg1) {
		
	}
	public static void main(String[] args) {
		method(null);
	}
}