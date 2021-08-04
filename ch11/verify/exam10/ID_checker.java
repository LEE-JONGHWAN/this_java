package verify.exam10;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ID_checker {
	public static void main(String[] args) {
//		Pattern.matches(null, null);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("식별자?: ");
			// 콘솔에서 일고 바른 식별자인지 검사
			if(sc.hasNext()) {
				String idCandi = sc.nextLine();
				if(idCandi.trim().length() == 0) {
					break;
				} else {
					String re = "[a-zA-Z][a-z0-9A-Z]{7,11}";
					if(Pattern.matches(re, idCandi))
						System.out.println("합격");
					else
						System.out.println("불합격");
				}
			}
		}
		sc.close();
	}
}
