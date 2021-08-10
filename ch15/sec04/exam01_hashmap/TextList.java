package sec04.exam01_hashmap;

import java.util.Arrays;
import java.util.Collections;

public class TextList {
	public static void main(String[] args) {
		String[] titles = {"난중일기", "태백산맥", "의사지바고"};
		// 생략된 내용
		System.out.println("=".repeat(10));
		System.out.println("오름차순 출력");
		System.out.println("=".repeat(10));
		Arrays.sort(titles);
		for(String title : titles) {
			System.out.println(title);
		}
		System.out.println("=".repeat(10));
		System.out.println("내림차순 출력");
		System.out.println("=".repeat(10));
		Arrays.sort(titles, Collections.reverseOrder());
		for(String title2 : titles) {
			System.out.println(title2);
		}
	}
}
