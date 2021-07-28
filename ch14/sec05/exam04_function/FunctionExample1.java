package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> studentlist = Arrays.asList(
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	);
	
	public static void printString(Student student, 
			Function<Student, String> getString) {
			System.out.println(getString.apply(student));
	}

	public static void printString(Function<Student, String> getString) {
	}	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : studentlist) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("[학생 이름] :");
		printString(studentlist.get(0), t -> t.getName() );
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() );
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
	}
}
