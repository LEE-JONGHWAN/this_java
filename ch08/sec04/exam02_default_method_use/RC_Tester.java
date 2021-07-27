package sec04.exam02_default_method_use;

public class RC_Tester {
	
	void 장치를사용한다(RemoteControl rc) { 
	rc = new Television();
	rc.turnOn();
	System.out.println(rc.setMute(true));
	rc.toggleMute();
	}
	
	public static void main(String[] args) {
		RC_Tester rc = new RC_Tester();
		rc.장치를사용한다(new Television());
		rc.장치를사용한다(new Audio());
	}
}
