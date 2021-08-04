package verify.exam13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		// 2021년 08월 04일 수요일 17시 25분
		
//		String dFormat = "yyyy년 MM월 dd일 E요일 a hh시 mm분";
		String dFormat = "yyyy년 MM월 dd일 E요일 HH시 mm분";
		var format = new SimpleDateFormat(dFormat);
		System.out.println(format.format(now));
	}
}
