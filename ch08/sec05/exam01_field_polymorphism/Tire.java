package sec05.exam01_field_polymorphism;

public interface Tire {
	String presureUnit = "PS I";
	public void roll();
	// satic method 적합한 기능이 무얼까?
	// 타이어 선택 기준.
	static String tire선택기준() {
		String 기준 = "브랜드 평판, 가능 최고 속도, 내 마모성능";
		return 기준;
	}
	default boolean canFly() {
		return false;
	}
}
