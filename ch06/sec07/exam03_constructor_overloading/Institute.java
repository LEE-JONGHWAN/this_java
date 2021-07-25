package sec07.exam03_constructor_overloading;

import java.time.LocalDate;
import java.time.Month;

public class Institute {
	private String instName;
	private String courseName;
	private int studentCount;
	private LocalDate startDate;

	
	public String getInstName() {
		return instName;
	}
	public void setInstName(String newName) {
		instName = newName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	/**
	 * 학원 개원일을 설정함.
	 * @param startDate 새 개원일
	 * @return 변경(시도) 후 (변경 되었을 수 있는)개원일
	 */
	public void setStartDate(LocalDate startDate) {
		if (startDate.isBefore(LocalDate.now())) {
		this.startDate = startDate;
		}
	}
	
	private static void justTest() {
		// 로컬 컴퓨터의 현재 날짜 정보를 저장한 LocalDate 객체를 리턴
		LocalDate currentDate = LocalDate.now();
		// result : 2019-11-13

		// 파라미터로 주어진 날짜 정보를 저장한 LocalDate 객체를 리턴한다.
		LocalDate targetDate = LocalDate.of(2019,11,12);
		 //결과 : 2019-11-12
		return;
	}

}
