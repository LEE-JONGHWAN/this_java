package sec02.exam03_abstract_method;

public class HoneyBee implements Superman {

	@Override
	public void canFly() {
		System.out.print("벌꿀 > ");
		System.out.println("이꽃에서 저꽃으로 30초 완성");
	}

	public static void main(String[] args) {
		HanbanAir air775 = new HanbanAir();
		air775.canFly();
		
		HoneyBee hBee = new HoneyBee();
		hBee.canFly();
	}

}
