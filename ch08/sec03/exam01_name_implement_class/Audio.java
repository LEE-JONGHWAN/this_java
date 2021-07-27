package sec03.exam01_name_implement_class;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.setMute(true);
		audio.setVolume(11);
	}
	
	@Override
	public void setMute(boolean mute) {
		System.out.println("오디오를...");
		RemoteControl.super.setMute(mute);
	}
	
	//setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
//		RemoteControl.super.setMute(true);
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
	//turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}	
	//turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

}
