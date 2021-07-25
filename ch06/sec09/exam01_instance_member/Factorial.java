package sec09.exam01_instance_member;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("N: ");
		int n = 1;
		String input = null;
		while (true) {
			try {
				if (scanner.hasNext()) 
				{
					input = scanner.nextLine().trim();
					n = Integer.parseInt(input);
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("'" + input + "'은 바른 수가 아닙니다");
				System.out.print("N: ");
			}
		}
		scanner.close();

		int facto = factorial(n);
		System.out.println("결과: " + facto); // 120
		System.out.println("End.");
		
	}

	private static int calcFactorial(int n) {
		assert (n >= 1);

		if (n == 1)
			return 1;
		else
			return n * calcFactorial(n - 1);
	}
	
	public static int factorial(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return factorial(n-1) * n;
		}
	}
}
