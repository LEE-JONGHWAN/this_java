package this_java.tests729days.num4;

import java.time.LocalDateTime;

abstract class Meeting {
	private String place;
	private LocalDateTime time;
	
	
	//toString()생성
	@Override
	public String toString() {
		return "Meeting [place=" + place 
				+ ", time=" + time + "]";
	}

	
	//Using Field 생성
	public Meeting(String place, LocalDateTime time) {
		super();
		this.place = place;
		this.time = time;
	}
	

	//getter/setter
	public String getPlace() {return place;}
	public void setPlace(String place) {this.place = place;}
	public LocalDateTime getTime() {return time;}
	public void setTime(LocalDateTime time) {this.time = time;}
	
}
