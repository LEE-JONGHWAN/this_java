package sec07.exam03_field_polymorphism;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		boolean runsWell = true;
		int probTire = 0;
		
		
		if(!frontLeftTire.roll()) { 
			runsWell = false; 
			probTire =  1; 
			};
		if(!frontRightTire.roll()) {
			runsWell = false; 
			probTire =  2; 
			};
		if(!backLeftTire.roll()) { 
			runsWell = false; 
			probTire =  3; 
			};
		if(!backRightTire.roll()) { 
			runsWell = false; 
			probTire =  4; 
			};
		
		
		if(!runsWell) stop();
		return probTire;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

