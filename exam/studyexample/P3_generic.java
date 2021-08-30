package studyexample;

import java.util.HashSet;

class NumHashSet <T extends Number> extends HashSet<T> {
	private static final long serialVersionUID = 1L;
}



public class P3_generic {
	public static void main(String[] args) {
		// 빈 곳 5 - 같은 형인자 두 객체 생성
		NumHashSet<Integer> s1 = new NumHashSet<Integer>();		
		NumHashSet<Integer> s2 = new NumHashSet<Integer>();
		//        - 두 객체 치환 코드
		s1.add(30);
		s2.add(40);
		s1 = s2;
		System.out.println(s1);
		
		
		
		//        - 다른 형인자 한 객체 생성		
		NumHashSet<Double> s3 = new NumHashSet<Double>();
		//        - 치환되지 않음 확인 코드
		s3.add(70.0);
//		s1 = s3;
		System.out.println(s1);
		
	}
}