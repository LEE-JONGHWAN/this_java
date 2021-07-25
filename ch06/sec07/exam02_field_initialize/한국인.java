package sec07.exam02_field_initialize;

public class 한국인 {
	//필드
	String 국적 = "대한민국";
	String name;
	String rrn;  //주민등록번호
	
	public 한국인(String name, String ssn) {
	  this.name = name;
	  this.rrn = ssn;
	}
}

