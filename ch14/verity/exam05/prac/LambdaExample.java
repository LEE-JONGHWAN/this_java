package verity.exam05.prac;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = { 10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result,  score);
		}
		return result;
	}
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(
			(i, j) -> (i >= j ? i : j)
				);
		System.out.println("최대값: " + max);
		
		
		//최소값 얻기
		int min = maxOrMin(
			(i, j) -> i <= j ? i : j);
		
//		int greater = 5 > 3 ? 5 : 3;
		System.out.println("최소값: " + min);
	}
}
