package sec07.exam03_constructor_overloading;

import java.time.LocalDate;
import java.time.Month;

public class InstituteTest {

	public static void main(String[] args) {
		Institute egenInst = new Institute();
		LocalDate startDay = LocalDate.of(2024, Month.JULY, 21);
		
//		justTest();
		egenInst.setStartDate(startDay);
		LocalDate sDate = egenInst.getStartDate();
		if(sDate != null && sDate.isEqual(startDay)){
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
}
