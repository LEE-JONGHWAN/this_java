package sec08.exam02_return;


public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			return false;
		}
		return true;
	}
	
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				System.out.println("gas를 주입할 필요가 없습니다.");
				
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				System.out.println("gas를 주입하세요.");
				return;
			}
		}
	}
}

