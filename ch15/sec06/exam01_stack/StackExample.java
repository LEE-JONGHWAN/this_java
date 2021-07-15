package sec06.exam01_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
	public static void main(String[] args) {
//		Stack<Coin> coinBox = new Stack<Coin>();
		
		Deque<Coin> coinBox = new ArrayDeque<Coin>();
		
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(1000));
		
		coinBox.stream().map(coin -> "꺼내온 동전 : " + coin.getValue() + "원")
			.forEach(System.out::println);

		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}

	}
}
