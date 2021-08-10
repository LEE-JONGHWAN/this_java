package sec09.exam01_instance_member;


public class HanoiTower {
	static long moveCount = 0;
	public static void main(String[] args) {
		printHanoi(1, 2, 3, 6);
		System.out.println("이동횟수: " + moveCount);
	}

	private static void printHanoi(
			int from, int temp, int to, int numDisks) {
		if (numDisks == 0) {
			return;
		}
		printHanoi(from, to, temp, numDisks - 1);
		System.out.println(from + "->" + to);
		moveCount++;
		printHanoi(temp, from, to, numDisks - 1);
	}

}
