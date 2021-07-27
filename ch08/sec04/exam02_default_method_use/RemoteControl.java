package sec04.exam02_default_method_use;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void toggleMute();
	
	
	
	//디폴트 메소드
	default String setMute(boolean mute) {
		if(mute == true) {
			return "를 무음 처리합니다.";
		} else {
			return "를 무음 해제합니다.";
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
