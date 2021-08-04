package sec16.exam01_java_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime thisTm = LocalDateTime.of(2023,  1, 1, 9, 0, 0);
		System.out.println("시작일: " + thisTm);
		
		LocalDateTime startDateTime = LocalDateTime.of(2024,  3, 31, 18, 0, 0);
		System.out.println("종료일: " + startDateTime + "\n");
		//--------------------------------------------------------------
		if(thisTm.isBefore(startDateTime)) {
			System.out.println("진행 중입니다." + "\n");
		} else if(thisTm.isEqual(startDateTime)) {
			System.out.println("종료합니다." + "\n");
		} else if(thisTm.isAfter(startDateTime)) {
			System.out.println("종료했습니다." + "\n");
		}
		//--------------------------------------------------------------
		System.out.println("[종료까지 남은 시간]");
		long remainYear = thisTm.until(startDateTime, ChronoUnit.YEARS);
		long remainMonth = thisTm.until(startDateTime, ChronoUnit.MONTHS);
		long remainDay = thisTm.until(startDateTime, ChronoUnit.DAYS);
		long remainHour = thisTm.until(startDateTime, ChronoUnit.HOURS);
		long remainMinute = thisTm.until(startDateTime, ChronoUnit.MINUTES);
		long remainSecond = thisTm.until(startDateTime, ChronoUnit.SECONDS);
		

		remainYear = ChronoUnit.YEARS.between(thisTm, startDateTime);
		remainMonth = ChronoUnit.MONTHS.between(thisTm, startDateTime);
		remainDay = ChronoUnit.DAYS.between(thisTm, startDateTime);
		remainHour = ChronoUnit.HOURS.between(thisTm, startDateTime);
		remainSecond = ChronoUnit.SECONDS.between(thisTm, startDateTime);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond + "\n");
		//--------------------------------------------------------------
		System.out.println("[종료까지 남은 기간]");
		Period period = Period.between(thisTm.toLocalDate(), startDateTime.toLocalDate());
		System.out.print("남은 기간: " + period.getYears() + "년 ");
		System.out.print(period.getMonths() + "달 ");
		System.out.println(period.getDays() + "일\n");
		//--------------------------------------------------------------
		Duration duration = 
      Duration.between(thisTm.toLocalTime(), startDateTime.toLocalTime());
		System.out.println("남은 초: " + duration.getSeconds());
	}
}

