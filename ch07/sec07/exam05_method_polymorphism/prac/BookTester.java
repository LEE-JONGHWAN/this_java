package sec07.exam05_method_polymorphism.prac;

import java.util.Arrays;

public class BookTester {
	// Book 배열에 두 종류의 책 객체 생성 삽입
	// 서적 정보 출력
	// 출력 중, book 유형이 text 이면 e-book 으로 변환
	/*
	 * 예상 출력
	 * 교재 제목: ..., 과목명: ..., 형태: 종이/전자 (생성때만 종이 가능) 출력은 전자로...
	 * 간행물 제목: ..., 발행 주기: ..., 
	 */
	public static void main(String[] args) {
	Book[] bost = new Book[2];
	 	bost[0] = new TextBook("자료구조", "JAVA", "종이책");
	 	bost[1] = new Periodicals("이거", Preper.년간,"E-Book");
	 	
	 	for(int i = 0; i< bost.length; i++) {
	 		if(bost[i] instanceof TextBook) {
//	 			(TextBook)bost[i].setForm();
	 		}
	 	}
	 	Arrays.stream(bost)
	 	.forEach(System.out::println);
	 	
	}
}
