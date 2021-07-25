package sec09.exam01_instance_member;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		System.out.println(myCar);
		yourCar.run();
		System.out.println(yourCar);
	}
}
