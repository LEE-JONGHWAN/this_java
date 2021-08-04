package verify.exam08;

import java.util.Arrays;
import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1(splict() 메소드 이용)
		String[] fields = str.split("[,]");
		Arrays.asList(fields).forEach(System.out::println);
		System.out.println();
		
		//방법2(StringTokenizer 이용)
		var tokenizer = new StringTokenizer(str, ",");
		tokenizer.asIterator().forEachRemaining(System.out::println);
		
//		while (tokenizer.hasMoreTokens()) {
//		System.out.println(tokenizer.hasMoreTokens());
//		}
//		
//		System.out.println();
		
	}
}
