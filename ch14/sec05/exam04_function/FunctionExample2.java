package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", 92, 96),
		new Student("신용권", 95, 93),
		new Student("신용권", 94, 93)
	);
	
	public static double avg(ToDoubleFunction<Student> function) {
		double sum = 0;
		for(Student student : list) {
			sum += function.applyAsDouble(student);
		}
		double avg = sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
