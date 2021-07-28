package sec05.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2의 배수 검사
		IntPredicate isEvenNumber = a -> 
		{
			System.out.println("kkk");
			return a%2 == 0;
		};
		//3의 배수 검사
		IntPredicate isMultiOf3 = (a) -> a%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB = isEvenNumber.and(isMultiOf3);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
		
		//or()
		predicateAB = isEvenNumber.or(isMultiOf3);
//		predicateAB = isMultiOf3.or(isEvenNumber);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? " + result);
		
		//negate()
		predicateAB = isEvenNumber.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
		result = isMultiOf3.negate().test(9);
		System.out.println("9는 3의 배수가 아니다: " + result);
	}
}
