package com.thisJava.ch15.sec02.exam04_hashtable;

import java.util.*;

public class HashtableTest {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		System.out.println(map.containsValue("1235"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id) 
				&& (map.get(id).equals(password))) {
					System.out.println("로그인 되었습니다.");
					break;
			} 
			System.out.println("입력하신 아이디/비밀번호가 존재하지 않습니다");
					
			}
			scanner.close();
		}
	}
