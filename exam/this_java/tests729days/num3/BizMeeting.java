package this_java.tests729days.num3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BizMeeting extends Meeting{
	// 생략된 필드 부분: 제출할 것.

	private String title;
	private MemberList<String> visitmail;


	public BizMeeting(String title,String place, 
			LocalDateTime time, MemberList<String> visitmail) {
		super(place, time);
		this.title = title;
		this.visitmail = visitmail;
	}

	// 출력 내용.
	@Override
	public String toString() {
		// 생략된 toString 부분: 제출할 것.
		StringBuffer emailstring = new StringBuffer();
		for (String email : visitmail) {
			if (emailstring.length() != 0) {
				emailstring.append("\n\t\t");
			}
			emailstring.append(email);
		}
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		return "업무회의 [주제=" + getTitle() + "\n" + "\t장소=" 
		   + getPlace() + "\n" + "\t시간=" + formatter.format(getTime()) + "\n" + "\t참석자 이메일="
				+ emailstring + "]";
	}

	// setter/getter : 제출하지 말것.
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public MemberList<String> getVisitmail() {return visitmail;}
	public void setVisitmail(MemberList<String> visitmail) {this.visitmail = visitmail;}


	public static void main(String[] args) {
		var emailstring = new MemberList<String>(inn ->  
					inn.contains("@") == true || inn.contains("$"));
		emailstring.add("abc@naver.com");
		emailstring.add("def@gmail.com");
		emailstring.add("hij@hanmail.net");
		emailstring.add("pop$hanmail.net");

		// 생략된 main 부분: 제출할 것.
		var marketingMeeting = new BizMeeting("마케팅 방법 개선","서울역 회의실",
				LocalDateTime.of(2021, 7, 29, 9, 30),emailstring);

		System.out.println(marketingMeeting);
	}
}
