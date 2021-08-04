package verify.exam09;

public class StringBuilderExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		String str = "";
		for(int i=1; i<=1000; i++) {
			str += i;
		}
		long end = System.nanoTime();
		System.out.println(str);
		//개선 후 코드
		long start2 = System.nanoTime();
		var sb = new StringBuilder();
		for(int i = 1; i <= 1000; i++) {
			sb.append(i);
		}
		long end2 = System.nanoTime();
		System.out.println(sb);
		System.out.println((end - start) + " " + (end2 - start2));
	}
}
