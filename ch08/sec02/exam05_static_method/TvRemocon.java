package sec02.exam05_static_method;

public class TvRemocon implements RemoteControl {

	@Override
	public void turnOn() {

	}
	
	public void changeBattery() {
		RemoteControl.changeBattery();
	}
	
	@Override
	public void turnOff() {

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}

}
