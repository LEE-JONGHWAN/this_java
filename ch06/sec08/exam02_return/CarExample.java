package sec08.exam02_return;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {  
			System.out.println("gas가 있습니다."); 
			System.out.println("출발합니다.");
			myCar.run();  //Car의 run() 메소드 호출
		} else {
			System.out.println("gas가 없습니다."); 
			
		}
	}
}

