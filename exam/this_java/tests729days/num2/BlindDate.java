package this_java.tests729days.num2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class BlindDate {
	// 제출할 것
	private String 장소;
	private LocalDateTime 시간;
	private MemberList<String> 핸드폰;

	
	public BlindDate(String 장소, 
		LocalDateTime 시간, MemberList<String> 핸드폰) {
		super();
		this.장소 = 장소;
		this.시간 = 시간;
		this.핸드폰 = 핸드폰;
	}


	@Override
	public String toString() {
		// 제출할 것
		StringBuffer phonestring = new StringBuffer();
		for (String phone : 핸드폰) {
			String random = RandomStringUtils.randomNumeric(8);
			if (phonestring.length() != 0) {
				phonestring.append("\n\t\t");
			}
			phonestring.append(phone.concat(random));
		}
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		return "사교만남 [장소=" + get장소() + "\n" + "\t시간=" 
		   + formatter.format(get시간()) + "\n" + "\t참석자 휴대폰=" + phonestring + "]";
	}

	// getter/setter 제출하지 말 것.
	public String get장소() {return 장소;}
	public void set장소(String 장소) {this.장소 = 장소;}
	public LocalDateTime get시간() {return 시간;}
	public void set시간(LocalDateTime 시간) {this.시간 = 시간;}
	public MemberList<String> get핸드폰() {return 핸드폰;}
	public void set핸드폰(MemberList<String> 핸드폰) {this.핸드폰 = 핸드폰;}

	
	public static void main(String[] args) {
		// 제출할 것
		MemberList<String> phonestring = new MemberList<String>(in -> in.startsWith("010"));


		var blid = new BlindDate("강남 캌테일바", 
				LocalDateTime.of(2021, 7, 30, 19, 30),phonestring);
	
		
		// (전화번호 ‘010’ 3개 및 ‘011’ 1개 추가를 시도함)
			for(int i = 0; i < 3;i++) {
				phonestring.add("010");
			}
				System.out.println(blid);
		
	}	
}
