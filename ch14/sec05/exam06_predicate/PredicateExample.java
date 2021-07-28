package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> studentlist = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 50),
			new Student("감자바", "남자",  95),
			new Student("박한나", "여자", 92)
	);
	
	/**
	 * 
	 * @param checkSex
	 * @return 성별별로 성적 평균을 계산한다.
	 */
	public static double avg(Predicate<Student> checkSex) {
		int count = 0, sum = 0;
		for(Student student : studentlist) {
			if(checkSex.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}
	/**
	 * 
	 * @param checkScore
	 * @return 합격자 인원을 체크하는 메소드.
	 */
	public static double countPass(Predicate<Student> checkScore) {
		int count = 0;
		for(Student student : studentlist) {
			if(checkScore.test(student)) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 
	 * @param args
	 * @return 여기는 람다식으로 출력하고 있다.
	 * 성별 및 합격자를 체크해 정보를 출력한다.
	 * 
	 */
	public static void main(String[] args) {
		double maleAvg = avg( t ->  t.getSex().equals("남자") );
		System.out.println("남자 평균 점수: " + maleAvg);
			
		double femaleAvg = avg( t ->  t.getSex().equals("여자") );
		System.out.println("여자 평균 점수: " + femaleAvg);

		int passCount = (int)countPass( t ->  t.getScore() >= 60);
		System.out.println("합격자 수: " + passCount);
	}
}
