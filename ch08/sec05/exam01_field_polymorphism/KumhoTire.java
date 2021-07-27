package sec05.exam01_field_polymorphism;

public class KumhoTire implements Tire {
	double pressure;
	
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}

	@Override
	public boolean canFly() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
