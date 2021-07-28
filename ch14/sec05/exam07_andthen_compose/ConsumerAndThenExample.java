package sec05.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> { 
//			System.out.println("consumerA: " + m.getName()); 
			System.out.println("국가: " + m.getName()); 
		};
		
		Consumer<Member> consumerB = (m) -> { 
//			System.out.println("consumerB: " + m.getId()); 
			System.out.println("도시: " + m.getId()); 
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		Consumer<Member> consumerABA = consumerB.andThen(consumerA);
		Consumer<Member> consumerABC = consumerA.andThen(consumerB);
//		consumerAB.accept(new Member("홍길동", "hong", null));
		consumerABA.accept(new Member("경기도 수원시", "한국", null));
	}
}
