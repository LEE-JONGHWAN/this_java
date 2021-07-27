package sec04.exam02_default_method_use;

public class Television implements RemoteControl {
	//필드
	private int volume;
	private boolean mute;
	
	@Override
	public void toggleMute() {
		if(mute)
			System.out.println("TV 가 무음처리 되었습니다.");
		else
			System.out.println("TV 가 무음 해제 되었습니다.");
	}
	
	@Override
	public String setMute(boolean flag) {
		this.mute = mute;
		return "티비" + RemoteControl.super.setMute(mute);
	}
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}	
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
}
