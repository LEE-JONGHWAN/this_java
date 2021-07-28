package sec05.exam02_consumer;

public class MyConsumerTest2 {

	public static void main(String[] args) {
		MyConsumer<String, Integer> myConsumer = 
				 (s, i) -> {System.out.println(s + i); };
		myConsumer.accept("자바 버전-", 11);
		

	}

}
