package sec08.exam01_abstract_class;

public class PhoneExample{
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		Phone phone = new SmartPhone("홍길동");
		
		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();
	}
}
