package studyexample;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class P1_Lambda {
	public static void main(String[] args) {
		int[] degree = {69, 78, 55, 89, 96};
		
		IntPredicate intPred = new IntPredicate() {

			@Override
			public boolean test(int value) {
				return value > 60;
			}
		};
		
		IntPredicate Lam = (a -> a > 60);
		
		
		
		int funInt = degreeCount(degree, intPred);
		int lambda = degreeCount(degree, Lam);
		
		System.out.println("인터페이스: " + funInt);
		System.out.println("람다식: " + lambda);
	}

	private static int degreeCount(int[] degree, 
			IntPredicate pred) {
		return (int)Arrays.stream(degree)
				.filter(pred).count();
	}
}
