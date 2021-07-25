package sec07.exam01_constructor_declaration;

public class Car {
	private String color;
	private int engineSize;

	public Car(String bodyColor,
			int engineVolume) {
		color = bodyColor;
		engineSize = engineVolume;
	}
	public String showColor() {
		return color;
	}
	public int readEngineSize() {
		return engineSize;
	}
}
