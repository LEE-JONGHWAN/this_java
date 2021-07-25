package sec09.exam01_instance_member;

public class Car {
	static int carNumberProduccedSoFar = 0;
	//필드
	String model;
	int speed;
	private int carId;
	
	
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	//생성자
	Car(String model) {
		carNumberProduccedSoFar++;
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model 
					+ "가 달립니다.(시속:" + this.speed + "km/h)" + "CarId: " + this.carId);
		}
	}	
}
