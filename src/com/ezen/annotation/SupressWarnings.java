package com.ezen.annotation;

import java.util.ArrayList;


public class SupressWarnings {

	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes" })
		var messages = new ArrayList();
		
		double d = Integer.valueOf(0);
	}

}
